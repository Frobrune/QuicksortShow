public class BubbleSort extends BaseAlgorithm {
    public BubbleSort(int arrayLength, int rangeStart, int rangeEnd) {
        super("Bubblesort", arrayLength, rangeStart, rangeEnd);
    }

    @Override
    void innerRun() {
        while (true) {
            boolean hasSwapped = false;
            for (int i = 0; i < (ARRAY.length - 1); i++) {
                if (ARRAY[i] > ARRAY[i + 1]) {
                    swapElements(i, i + 1);
                    hasSwapped = true;
                }
            }

            if (!hasSwapped) break;
        }
    }
}
