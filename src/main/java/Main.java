import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Main {

    public int findPivot(int[] array) {
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
    }

    static void main(String[] args) {
        Random rnd = new Random(44);
        int[] data = rnd.ints(10, 0, 100).toArray();
        int[] expected = data.clone();
        Arrays.sort(expected);
        System.out.println(Arrays.toString(data));

        System.out.println("============================");



        int j;
        List<Integer> sortingList = new ArrayList<>();
        do {
            sortingList.clear();
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int i = 0; i < data.length; i++) {
                if (data[i] == data[pivot]) {
                    continue;
                }
                if (data[i] > data[pivot]) {
                    right.add(data[i]);
                } else {
                    left.add(data[i]);
                }
            }
            left.add(pivot);
            sortingList.addAll(left);
            sortingList.addAll(right);
            j = left.size();
            System.out.println(sortingList);
        } while (j > 1);

        System.out.println("============================");
        System.out.println(Arrays.toString(expected));

    }
}
