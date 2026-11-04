import java.util.Random;


public class Main {
    static void draw(int[] state) {
        System.out.print("\033[H\033[2J");
        for (int value : state) {
            System.out.println("#".repeat(value));
        }
        System.out.flush();
    }

    static void timeChecker() {
        Sorter[] sorters = {new BubbleSort(),
                new GnomeSort(),
                new InsertionSort(),
                new QuickSort(),
                new MergeSort()};

        for (Sorter sorter : sorters) {
            System.out.println("=================");
            long[] avg = new long[5];
            int i = 0;
            for (int seed = 30; seed < 35; seed++) {
                Random rnd = new Random(seed);
                int[] data = rnd.ints(20_000, 0, 100).toArray();

                long start = System.currentTimeMillis();
                sorter.sort(data);
                long end = System.currentTimeMillis();
                System.out.println((end - start) + "ms");
                avg[i] = end - start;
                i++;
            }
            long average = 0;
            for (long element : avg) {
                average += element;
            }
            average /= avg.length;
            System.out.println("sorter:" + sorter.name() + "; average speed:" + average + "ms");
        }
    }

    static void main(String[] args) {
        Random rnd = new Random(44);
        int[] data = rnd.ints(10, 1, 10).toArray();
        draw(data);
        timeChecker();
    }
}
