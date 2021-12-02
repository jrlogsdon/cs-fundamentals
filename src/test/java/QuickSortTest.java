import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sortBasic() {
        int[] nums = new int[]{4, 3, 1, 2};
        int[] expected = new int[]{1, 2, 3, 4};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortDuplicates() {
        int[] nums = new int[]{6, 6, 3, 1, 0, -1, 2, -5};
        int[] expected = new int[]{-5, -1, 0, 1, 2, 3, 6, 6};

        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void sortLargeInput() {
        int[] nums = new int[] {15, 13, 12, 14, -1, 2, 6, 8, 11, 14, 13, 12, 1, 3, 3, 64, -100};
        int[] expected = new int[] {-100, -1, 1, 2, 3, 3, 6, 8, 11, 12, 12, 13, 13, 14, 14, 15, 64};

        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

}