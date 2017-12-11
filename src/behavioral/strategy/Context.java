package behavioral.strategy;

public class Context {

    SortStrategy strategy;

    public Context(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] sortFromMaxToMin(int[] array) {
        return strategy.sortFromMaxToMin(array);
    }

    public int[] sortFromMinToMax(int[] array) {
        return strategy.sortFromMinToMax(array);
    }
}
