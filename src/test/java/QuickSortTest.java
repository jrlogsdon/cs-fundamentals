import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void canCallSort() {
        int[] nums = new int[]{4,3,1,2};
        QuickSort.sort(nums);

    }

}