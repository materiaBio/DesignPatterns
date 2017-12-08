package behavioral.state;

public class Context {

    private WaterState state;

    public Context(){
        state = null;
    }

    public WaterState getWaterState() {
        return state;
    }

    public void setWaterState(WaterState state) {
        this.state = state;
    }
}
