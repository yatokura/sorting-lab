import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingCorrectnessTest {
    String[] sorters = new String[0];
//    @ParameterizedTest
//    @MethodSource("sorters")
// список всех сортировок
    @Test
    void sortsRandomArrays() {
        Random rnd = new Random(42);
        for (int size = 0; size <= 100; size++) {
            int[] data = rnd.ints(size, -1000, 1000).toArray();
            int[] expected = data.clone();
            Arrays.sort(expected);

            Sorter bubblesort = new BubbleSort();
            bubblesort.sort(data);
            assertArrayEquals(expected, data);
        }
    }

    @Test
    void checkIfSortDontLosingAnything(){

    }
}
