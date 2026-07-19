package ArraysProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeArrayBySign {

    public static int[] rearrangeArray(int[] nums, int n) {
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = rearrangeArray(nums, n);

        System.out.println("Rearranged Array: " + Arrays.toString(result));

        sc.close();
    }
}