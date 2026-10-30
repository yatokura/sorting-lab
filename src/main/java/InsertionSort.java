public class InsertionSort implements Sorter{

    @Override
    public void sort(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[0]>0) {
                i++;
            } else {
                SortsUtils.swap(array, i - 1, i);
                i--;
            }
        }
    }

    @Override
    public String name() {
        return "InsertionSort";
    }
}
