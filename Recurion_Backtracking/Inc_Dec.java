package Recurion_Backtracking;
import java.util.*;
public class Inc_Dec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int n=sc.nextInt();
        Inc_Dec ob=new Inc_Dec();
        System.out.println("Increasing Order:");
        ob.printIncreaseing(n);
        System.out.println("\nDecreasing Order:");
        ob.printDecreasing(n);
    }
    void printIncreaseing(int n){
        if(n==0)
        return ;
        printIncreaseing(n-1);
        System.out.print(n+" ");
    }
    void printDecreasing(int n){
        if(n==0)
            return ;
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
}
