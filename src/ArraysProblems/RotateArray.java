package ArraysProblems;

import java.util.Scanner;

public class RotateArray {

    public static void LeftRotate(int a[], int n) {


        int temp = a[0];

        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }

        a[n - 1] = temp;


        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void RotateDplaces(int[] a, int n, int d) {

        d = d % n;

        Reverse(a, 0, d - 1);
        Reverse(a, d, n - 1);
        Reverse(a, 0, n - 1);
    }

    public static void Reverse(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
    public static void MoveZerosEnd(int[] a, int n) {

        int j = -1;

        // Find first zero
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Left Rotate by 1");
            System.out.println("2. Left Rotate by D Places");
            System.out.println("3. Move Zeros to End");
            System.out.println("4. Print Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    LeftRotate(a, n);
                    break;

                case 2:
                    System.out.print("Enter D: ");
                    int d = sc.nextInt();
                    RotateDplaces(a, n, d);

                    System.out.println("Array after D rotation:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    MoveZerosEnd(a, n);

                    System.out.println("Array after moving zeros:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Current Array:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);


        sc.close();
    }
}