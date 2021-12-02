public class QuickSort {

    public static void sort(int[] nums) {
        QuickSort quickSort = new QuickSort();
        int startIndex = 0;
        int endIndex = nums.length - 1;

        quickSort.quickSort(nums, startIndex, endIndex);
    }

    private void quickSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partition = partition(nums, startIndex, endIndex);

            quickSort(nums, startIndex, partition - 1);

            quickSort(nums, partition + 1, endIndex);
        }

    }

    private int partition(int[] nums, int startIndex, int endIndex) {
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

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
