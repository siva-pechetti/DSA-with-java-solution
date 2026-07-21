package ArraysProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderArray {

    public static void main(String[] args) {

        ArrayList<Integer> leader = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                leader.add(a[i]);
            }
        }

        Collections.reverse(leader);

        System.out.println("Leader Elements: " + leader);
    }
}