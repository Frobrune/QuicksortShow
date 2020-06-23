public class Main {
    public static void main(String[] args) {
        int arrayLength = 10000;
        int rangeStart = 0, rangeEnd = 1000000;

        new QuickSort(arrayLength, rangeStart, rangeEnd).run();
        System.out.println();
        new BubbleSort(arrayLength, rangeStart, rangeEnd).run();
    }
}
