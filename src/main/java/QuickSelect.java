public class QuickSelect {

    public static int selectNthLargest(int[] nums, int nthLargestElement) {
        assert(nthLargestElement <= nums.length);
        assert(nthLargestElement >= 0 );
        if (nums.length == 1) return nums[0];
        int index = quickSelectIndex(nums, 0, nums.length - 1, nums.length - nthLargestElement);
        return nums[index];
    }

    private static int quickSelectIndex(int[] nums, int startIndex, int endIndex, int indexSearchedFor) {
        if (startIndex < endIndex) {
            int partition = partition(nums, startIndex, endIndex);
            if (partition == indexSearchedFor) return partition;
            else if (partition < indexSearchedFor) {
                return quickSelectIndex(nums, partition + 1, endIndex, indexSearchedFor);
            }
            else {
                return quickSelectIndex(nums, startIndex, partition - 1, indexSearchedFor);
            }
        }
        if (startIndex == endIndex) return startIndex;
        return -1;
    }

    private static int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];

        for (int j = startIndex; j <= endIndex - 1; j++) {

            if (nums[j] < pivot) {
                swap(nums, startIndex, j);
                startIndex++;
            }

        }
        swap(nums, startIndex, endIndex);
        return startIndex;
    }
    private static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
