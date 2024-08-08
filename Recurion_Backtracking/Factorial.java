package Recurion_Backtracking;
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        Factorial ob=new Factorial();
        int n=sc.nextInt();
        System.out.println("Factorial="+ob.fact(n));
    }
    int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }

}
