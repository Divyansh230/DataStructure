package Recurion_Backtracking;
import java.util.*;
public class fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacii ob=new fibonacii();
        for(int i=1;i<=n;i++)
            System.out.print(ob.print(i)+" ");
    }
    int print(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 1;
        else
            return print(n-1)+print(n-2);
    }
}
