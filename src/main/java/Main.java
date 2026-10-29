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
        for (int i = 1; i < data.length; i++) {
            while (i<data.length) {
                SortsUtils.swap(data, i - 1, i);
                System.out.println(Arrays.toString(data));
                i--;
            }

        }
        System.out.println("============================");
        System.out.println(Arrays.toString(expected));

    }
}
