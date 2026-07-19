package ArraysProblems;

import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = maxSubArray(nums,n);
        System.out.println("MaxSum of subArray: " + result);
        sc.close();
    }
    public static int maxSubArray(int[] nums,int n){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum +=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
}
