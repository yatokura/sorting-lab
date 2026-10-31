import java.util.ArrayList;
import java.util.List;

public class QuickSort implements Sorter{
     private int findPivot(int[] array) {
        int pivot;
        int middleIndex = (array.length - 1) / 2;
        int lastIndex = array.length - 1;
        System.out.println(array[middleIndex]);
        if ((array[0] > array[middleIndex] && array[0] < array[lastIndex]) ||
                (array[0] < array[middleIndex] && array[0] > array[lastIndex])) {
            System.out.println("first");
            pivot = 0;
        } else if ((array[lastIndex] > array[middleIndex] && array[lastIndex] < array[0]) ||
                (array[lastIndex] < array[middleIndex] && array[lastIndex] > array[0])) {
            System.out.println("last");
            pivot = lastIndex;
        } else {
            System.out.println("middle");
            pivot = middleIndex;
        }
        return pivot;
    }

    private int[] quickSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();

        int pivot = findPivot(array);
        SortsUtils.swap(array, pivot, array.length - 1);
        pivot = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[pivot]) {
                low.add(array[i]);
            } else {
                high.add(array[i]);
            }
        }

        List<Integer> result = new ArrayList<>();

        int[] lowArr = low.stream().mapToInt(Integer::intValue).toArray();
        int[] highArr = high.stream().mapToInt(Integer::intValue).toArray();
        int[] sortedLow = quickSort(lowArr);
        int[] sortedHigh = quickSort(highArr);

        for (int x : sortedLow) result.add(x);
        result.add(array[pivot]);
        for (int x : sortedHigh) result.add(x);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public void sort(int[] array) {
        array = quickSort(array);
    }

    @Override
    public String name() {
        return "QuickSort";
    }
}
