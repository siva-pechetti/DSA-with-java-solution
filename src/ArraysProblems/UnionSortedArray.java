package ArraysProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionSortedArray {
    public static void UnionSort(int[] a,int n,int[] b,int m){
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int num:a ){
            uniqueNumbers.add(num);
        }
        for(int num:b){
            uniqueNumbers.add(num);
        }
        System.out.println(uniqueNumbers);

    }
    public static void IntersectionSort(int[] a,int n,int[] b,int m){
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(int num:a ){
            set.add(num);
        }
        for(int num :b){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        System.out.println(intersection);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of a:");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter Size of b:");

        int m= sc.nextInt();
        int[] b=new int[m];
        System.out.println("Enter numbers:");
        for(int i=0;i<m;i++){
            b[i]= sc.nextInt();
        }

        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1.Union sorted of two Arrrays:");
            System.out.println("2.Instersection sorted of two Arrrays:");
            System.out.println("choice menu:");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    UnionSort(a,n,b,m);
                    break;
                case 2:
                    IntersectionSort(a,n,b,m);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice !=5);
        sc.close();
    }
}
