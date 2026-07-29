package Searching;

public class UpperBound {
    static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 7};
        System.out.println(upperBound(arr, 4));
    }
}
