public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = array.length; i >= 0; i--) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    SortsUtils.swap(array, j - 1, j);
                }
            }
        }
    }

    @Override
    public String name() {
        return "BubbleSort";
    }

    @Override
    public String toString(){
        return name();
    }
}
