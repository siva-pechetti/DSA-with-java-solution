package Searching;

public class ArrayRotationCount {

    public static int findRotationCount(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        int index = 0;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[low] <= nums[high]) {
                if (nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                break;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                low = mid + 1;
            }

            else {
                if (nums[mid] < ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findRotationCount(nums));
    }
}