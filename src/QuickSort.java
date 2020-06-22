public class QuickSort extends BaseAlgorithm {
    public QuickSort(int arrayLength, int rangeStart, int rangeEnd) {
        super("Quicksort", arrayLength, rangeStart, rangeEnd);
    }

    @Override
    public void innerRun() {
        quickSort(0, ARRAY.length - 1);
    }

    private void quickSort(int firstElement, int lastElement) {
        if (firstElement >= lastElement) return;

        int middle = (firstElement + lastElement) / 2;
        int pivot = ARRAY[middle];

        int i = firstElement, j = lastElement;
        while (i <= j) {
            while (ARRAY[i] < pivot) i++;
            while (ARRAY[j] > pivot) j--;

            if (i <= j) {
                swapElements(i, j);
                i++;
                j--;
            }
        }
        if (firstElement < j) quickSort(firstElement, j);
        if (lastElement > i) quickSort(i, lastElement);
    }
}
