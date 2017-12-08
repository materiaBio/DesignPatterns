package behavioral.state;

public class VaporWaterState implements WaterState {

    @Override
    public void getFunActivity(Context context) {
        System.out.println("We are gonna taking a steam bath");
        context.setWaterState(this);
    }

    public String toString() {
        return "State: Water vaporizes" + "\n";
    }
}
