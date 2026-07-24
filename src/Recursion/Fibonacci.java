package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();

        System.out.print("Enter index to find Fibonacci number: ");
        int n1 = sc.nextInt();

        int result = fib(n1);
        System.out.println("Fibonacci number at index " + n1 + " is: " + result);

        sc.close();
    }
}