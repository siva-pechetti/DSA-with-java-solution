import java.util.Scanner;
public class LargestSmallest{
    public static void Large(int[] a, int n) {
        int l = a[0];
        int sl = -1;
        for (int i = 1; i < n; i++) {
            if (a[i] > l) {
                sl = l;
                l = a[i];
            } else if (a[i] < l && a[i] > sl) {
                sl = a[i];
            }
        }
        System.out.println("Largest = " + l);
        System.out.println("Second Largest = " + sl);
    }
    public static void Smallest(int[] a, int n) {
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < small) {
                secondsmall = small;
                small = a[i];
            } else if (a[i] > small && a[i] < secondsmall) {
                secondsmall = a[i];
            }
        }

        System.out.println("Smallest: " + small);

        if (secondsmall == Integer.MAX_VALUE)
            System.out.println("Second Smallest does not exist");
        else
            System.out.println("Second Smallest: " + secondsmall);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] a = new int[n];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Large(a, n);
        Smallest(a,n);

        sc.close();
    }
}