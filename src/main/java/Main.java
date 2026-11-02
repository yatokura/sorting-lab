import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Main {

    public static int[] quickSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();

        int pivot =0;
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

    static void main(String[] args) {
        Random rnd = new Random(44);
        int[] data = rnd.ints(10, 0, 100).toArray();
        int[] expected = data.clone();
        Arrays.sort(expected);
        System.out.println(Arrays.toString(data));

        System.out.println("============================");

        if (data.length <= 1) {
            System.out.println("sakin kok da ya podrochil huek");
        }

        int middleIndex = data.length;

        int[] left = new int[data.length/2];
        int[] right = new int[data.length/2];
        System.arraycopy(data,0,left,0,data.length/2);
        System.arraycopy(data,5,right,0,data.length/2);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(quickSort(data)));

        System.out.println("============================");
        System.out.println(Arrays.toString(expected));

    }
}
