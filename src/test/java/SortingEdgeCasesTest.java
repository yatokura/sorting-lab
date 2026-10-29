import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingEdgeCasesTest {
    @Test
    void ifMassiveIsEmptyThenReturnEmptyExceptrion() {
        int[] data = {};
        new BubbleSort().sort(data);
        assertArrayEquals(new int[]{}, data);
    }

    @Test
    void ifMassiveIsAlreadySortedThanReturnIt() {
        int[] data = {1, 2, 3, 4, 5};
        new BubbleSort().sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }

    @Test
    void ifMassiveIsSortedBackwards() {
        int[] data = {5, 4, 3, 2, 1};
        new BubbleSort().sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }

    @Test
    void ifMassiveConsistsOnlyOfSame() {
        int[] data = {1, 1, 1, 1, 1, 1};
        new BubbleSort().sort(data);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1}, data);
    }

    @Test
    void ifNumsAreMinus() {
        int[] data = {-3, 0, -1, 2};
        new BubbleSort().sort(data);
        assertArrayEquals(new int[]{-3, -1, 0, 2}, data);
    }
}
