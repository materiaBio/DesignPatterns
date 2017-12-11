package behavioral.strategy;

public class SortStrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new BubbleSort());
        int[] sorted = context.sortFromMaxToMin(new int[]{3, 7, 1, 5, 9, 9, 5});
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }

        System.out.println();
        sorted = context.sortFromMinToMax(new int[]{3, 7, 1, 5, 9, 9, 5});
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
