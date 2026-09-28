import java.util.HashSet;
import java.util.Scanner;
    import java.util.Arrays;
    import java.util.Set;

public class Pratice1 {
    public static void factorial(int n){

        int fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);


       int start= sc.nextInt();
        int end=sc.nextInt();
       for(int i=start;i<end;i++){
           factorial(i);
       }
    }
}
