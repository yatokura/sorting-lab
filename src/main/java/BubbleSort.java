public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    SortsUtils.swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }
    }

    @Override
    public String name() {
        return "BubbleSort";
    }

    @Override
    public String toString() {
        return name();
    }
}
