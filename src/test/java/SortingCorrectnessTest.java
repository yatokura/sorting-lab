import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingCorrectnessTest<sorters> {
    Sorter[] sorters = new Sorter[0];

    static Stream<Sorter> sorters() {
        return Stream.of(new BubbleSort(), new GnomeSort(),new InsertionSort());
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void sortsRandomArrays(Sorter sorter) {
        Random rnd = new Random(42);
        for (int size = 0; size <= 10; size++) {
            int[] data = rnd.ints(size, 0, 10).toArray();
            int[] expected = data.clone();
            Arrays.sort(expected);

            sorter.sort(data);
            assertArrayEquals(expected, data);
        }
    }

    @Test
    void checkIfSortDontLosingAnything() {
        int[] data = {5, -2, 9, 3};
        long sumBefore = Arrays.stream(data).sum();
        new BubbleSort().sort(data);
        assertEquals(sumBefore, Arrays.stream(data).sum());   // ничего не потерялось
        assertEquals(4, data.length);
    }
}
