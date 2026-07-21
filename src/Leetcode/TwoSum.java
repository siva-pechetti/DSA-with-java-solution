package Leetcode;

import java.util.Scanner;

public class TwoSum {

    public static void twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    System.out.println("["+i +","+j +"]");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Target:");
        int target = sc.nextInt();

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        twoSum1(nums, target);

        sc.close();
    }
}
