import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingCorrectnessTest {
    static Stream<Sorter> sorters() {
        return Stream.of(new BubbleSort(),
                new GnomeSort(),
                new InsertionSort(),
                new QuickSort(),
                new MergeSort());
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void sortsRandomArrays(Sorter sorter) {
        Random rnd = new Random(42);
        for (int size = 0; size <= 100; size++) {
            int[] data = rnd.ints(size, 0, 100).toArray();
            int[] expected = data.clone();
            Arrays.sort(expected);

            sorter.sort(data);
            assertArrayEquals(expected, data);
        }
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void checkIfSortDontLosingAnything(Sorter sorter) {
        int[] data = {5, -2, 9, 3};
        long sumBefore = Arrays.stream(data).sum();
        sorter.sort(data);
        assertEquals(sumBefore, Arrays.stream(data).sum());
        assertEquals(4, data.length);
    }
}
