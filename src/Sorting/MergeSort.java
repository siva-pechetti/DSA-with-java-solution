package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        while (right <= high) {
            temp.add(a[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
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

        mergeSort(a, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}