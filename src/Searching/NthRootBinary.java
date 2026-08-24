package Searching;

import java.util.Scanner;

public class NthRootBinary {

    public static long NthRoot(int mid, int m) {
        long result = 1;

        for (int i = 1; i <= m; i++) {
            result *= mid;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter m:");
        int m = sc.nextInt();

        int low = 0;
        int high = n;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long value = NthRoot(mid, m);

            if (value == n) {
                ans = mid;
                break;
            }

            if (value < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (ans != -1) {
            System.out.println(m + "th root of " + n + " is " + ans);
        } else {
            System.out.println("Exact root does not exist.");
        }
    }
}