package ArraysProblems;

import java.util.Scanner;

public class MissingNumbers {

    public static int findMissing(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        for (int num : arr) {
            xor2 ^= num;
        }
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissing(arr, n);

        System.out.println("Missing Number: " + missing);

        sc.close();
    }
}