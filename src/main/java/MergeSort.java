import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorter {
    private int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int middleIndex = array.length / 2;

        int[] left = new int[middleIndex];
        int[] right = new int[array.length - middleIndex];
        System.arraycopy(array, 0, left, 0, middleIndex);
        System.arraycopy(array, middleIndex, right, 0, right.length);

        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result.add(left[i]);
                i++;
            } else {
                result.add(right[j]);
                j++;
            }
        }

        while (i < left.length) {
            result.add(left[i]);
            i++;
        }
        while (j < right.length) {
            result.add(right[j]);
            j++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public void sort(int[] array) {
        int[] sorted = mergeSort(array);
        for (int i = 0; i < sorted.length; i++) {
            array[i] = sorted[i];
        }
    }

    @Override
    public String name() {
        return "MergeSort";
    }
}
