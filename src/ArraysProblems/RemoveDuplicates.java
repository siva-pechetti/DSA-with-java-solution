package ArraysProblems;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter Size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        int newLength = i + 1;
        System.out.println("New Length = " + newLength);
        System.out.print("Array: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(a[k] + " ");
        }

        sc.close();
    }
}
