import java.util.Arrays;

public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (j<i) {
                    SortsUtils.swap(array,j,i);
                }
                System.out.println(Arrays.toString(array));
            }
        }

    }

    @Override
    public String name() {
        return "BubbleSort";
    }
}
