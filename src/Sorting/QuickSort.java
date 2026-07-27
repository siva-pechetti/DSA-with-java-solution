package Sorting;

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int m = partition(a, low, high);
            quickSort(a, low, m - 1);
            quickSort(a, m + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {

        int pivot = a[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high && a[i] <= pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter Array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        quickSort(a, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int x : a) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}