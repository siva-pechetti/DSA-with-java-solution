import java.util.Scanner;

public class ConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter 0s and 1s:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Maximum Consecutive Ones: " + findMaxConsecutiveOnes(nums));

        sc.close();
    }
}