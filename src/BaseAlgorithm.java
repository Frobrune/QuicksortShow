import java.util.Arrays;
import java.util.Random;

public abstract class BaseAlgorithm {
    protected final String NAME;
    protected final int[] ARRAY;

    public BaseAlgorithm(String name, int arrayLength, int rangeStart, int rangeEnd) {
        // Catch illegal arguments
        if (arrayLength <= 0) throw new IllegalArgumentException("Array must have at least one element!");
        if (rangeStart >= rangeEnd) throw new IllegalArgumentException("Range end must be greater than range start!");

        // Set algorithm name
        NAME = name;

        // Generate array
        Random random = new Random();
        ARRAY = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) ARRAY[i] = rangeStart + random.nextInt((rangeEnd + 1 - rangeStart));
    }

    /**
     * Runs the algorithm function and measures its running time.
     */
    public void run() {
        // Backup initial array
        int[] arrayBefore = Arrays.copyOf(ARRAY, ARRAY.length);

        // Get system time at start, run algorithm, measure elapsed time
        long start = System.currentTimeMillis();
        innerRun();
        long end = System.currentTimeMillis();
        long runtime = end - start;

        // Print results
        System.out.println(NAME.toUpperCase());
        System.out.println();
        System.out.println(String.format("Array before: %s", Arrays.toString(arrayBefore)));
        System.out.println(String.format("Array after: %s", Arrays.toString(ARRAY)));
        System.out.println(String.format("Time: %d ms", runtime));
        System.out.println();
    }

    /**
     * The actual algorithm implementation.
     */
    abstract void innerRun();

    /**
     * Swaps two elements in the array.
     *
     * @param index1 The index of the first element to swap.
     * @param index2 The index of the second element to swap.
     */
    protected void swapElements(int index1, int index2) {
        if (index1 == index2) return;

        int temp = ARRAY[index1];
        ARRAY[index1] = ARRAY[index2];
        ARRAY[index2] = temp;
    }
}
