package behavioral.state;

public class LiquidWaterState implements WaterState {

    @Override
    public void getFunActivity(Context context) {
        System.out.println("We are gonna swimming");
        context.setWaterState(this);
    }


    public String toString() {
        return "State: Water is wet and fluid" + "\n";
    }
}
