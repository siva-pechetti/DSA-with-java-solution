package Leetcode;
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        int index = -1;

        // Step 1: Find breakpoint
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If no breakpoint, reverse whole array
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 2: Find next greater element
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 3: Reverse the remaining part
        reverse(nums, index + 1, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

