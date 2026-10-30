public class InsertionSort implements Sorter{

    @Override
    public void sort(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] < array[i]) {
                i++;
            } else {
                int k = i;
                while (k > 0 && array[k - 1] > array[k]) {
                    SortsUtils.swap(array, k - 1, k);
                    k--;
                }
                i++;
            }
        }
    }

    @Override
    public String name() {
        return "InsertionSort";
    }
}
