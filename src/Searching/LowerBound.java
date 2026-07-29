package Searching;

import java.util.Scanner;

public class LowerBound {
    static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(lowerBound(arr, 4));

    }
}