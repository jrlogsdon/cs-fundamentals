import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest {

    @Test
    void simpleTest() {
        int[] nums = new int[] {3, 2, 1, 5, 6, 4};
        int nthLargest = 2;
        int expected = 5;
        callQuickSelectAndAssertEquality(nums, nthLargest, expected);
    }

    @Test
    void oneElement() {
        int[] nums = new int[] {1};
        int nthLargest = 1;
        int expected = 1;

        callQuickSelectAndAssertEquality(nums, nthLargest, expected);
    }

    @Test
    void twoElement() {
        int[] nums = new int[] {2, 1};
        int nthLargest = 1;

        int expected = 2;
        callQuickSelectAndAssertEquality(nums, nthLargest, expected);
    }

    private void callQuickSelectAndAssertEquality(int[] nums, int nthLargest, int expected) {
        int actual = QuickSelect.selectNthLargest(nums, nthLargest);
        assertEquals(expected, actual);
    }

}