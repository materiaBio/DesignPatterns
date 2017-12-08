package behavioral.state;

/**
 * @author tamara
 */
public class StatePatternTest {

    public static void main(String[] args) {
        Context context = new Context();

        WaterState liquidWaterState = new LiquidWaterState();
        liquidWaterState.getFunActivity(context);
        System.out.println(context.getWaterState().toString());

        WaterState solidWaterState = new SolidWaterState();
        solidWaterState.getFunActivity(context);
        System.out.println(context.getWaterState().toString());

        WaterState vaporWaterState = new VaporWaterState();
        vaporWaterState.getFunActivity(context);
        System.out.println(context.getWaterState().toString());
    }
}
