package Searching;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target value:");
        int target= sc.nextInt();
        System.out.println(binarySearch(arr, target));

    }
}