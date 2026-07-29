package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class FloorCeil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Binary search requires sorted array

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println("---Menu---");
        System.out.println("1. Ceil");
        System.out.println("2. Floor");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ceil = " + ceil(arr, target));
                break;

            case 2:
                System.out.println("Floor = " + floor(arr, target));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
    static int ceil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}