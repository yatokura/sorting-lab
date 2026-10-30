import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingEdgeCasesTest {
    Sorter[] sorters = new Sorter[0];

    static Stream<Sorter> sorters() {
        return Stream.of(new BubbleSort(), new GnomeSort(),new InsertionSort());
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void ifMassiveIsEmptyThenReturnEmptyExceptrion(Sorter sorter) {
        int[] data = {};
        sorter.sort(data);
        assertArrayEquals(new int[]{}, data);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void ifMassiveIsAlreadySortedThanReturnIt(Sorter sorter) {
        int[] data = {1, 2, 3, 4, 5};
        sorter.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void ifMassiveIsSortedBackwards(Sorter sorter) {
        int[] data = {5, 4, 3, 2, 1};
        sorter.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void ifMassiveConsistsOnlyOfSame(Sorter sorter) {
        int[] data = {1, 1, 1, 1, 1, 1};
        sorter.sort(data);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1}, data);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void ifNumsAreMinus(Sorter sorter) {
        int[] data = {-3, 0, -1, 2};
        sorter.sort(data);
        assertArrayEquals(new int[]{-3, -1, 0, 2}, data);
    }
}
