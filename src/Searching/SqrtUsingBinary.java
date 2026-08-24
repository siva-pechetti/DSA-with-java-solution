package Searching;

import java.util.Scanner;

public class SqrtUsingBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sqrt number of:");
        int n= sc.nextInt();


        int low=0;
        int high=n;
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid*mid)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Sqrt of "+n+ " is "+ans);
    }
}
