import java.util.Arrays;
import java.util.Random;


public class Main {
    static void main(String[] args) {
        Random rnd = new Random(44);
        int[] data = rnd.ints(10, 0, 100).toArray();
        int[] expected = data.clone();
        Arrays.sort(expected);
        System.out.println(Arrays.toString(data));

        System.out.println("============================");
        int i = 1;
        while (i < data.length) {
            if (data[i - 1] < data[i]) {
                i++;
            } else {
                int k = i;
                while (k > 0 && data[k - 1] > data[k]) {
                    SortsUtils.swap(data, k - 1, k);
                    k--;
                }
                i++;
            }
            System.out.println(Arrays.toString(data));
        }
        System.out.println("============================");
        System.out.println(Arrays.toString(expected));

    }
}
