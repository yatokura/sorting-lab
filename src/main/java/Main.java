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
        for (int i = data.length; i > 0; i--) {
            for (int j = 1; j < data.length; j++) {
                if (data[j - 1] > data[j]) {
                    SortsUtils.swap(data, j - 1, j);
                }
                System.out.println(Arrays.toString(data));
            }
        }
        System.out.println("============================");
        System.out.println(Arrays.toString(expected));

    }
}
