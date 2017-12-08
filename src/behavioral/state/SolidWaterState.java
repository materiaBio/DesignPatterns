package behavioral.state;

public class SolidWaterState implements WaterState {

    @Override
    public void getFunActivity(Context context) {
        System.out.println("We are gonna skating");
        context.setWaterState(this);
    }

    public String toString() {
        return "State: Water is frozen" + "\n";
    }
}
