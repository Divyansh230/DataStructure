package Recurion_Backtracking;
import java.util.*;
public class Sorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(issorted(a,0))
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
    static boolean issorted(int a[],int i){
        if(i>=a.length)
            return true;
        if(a[i]>a[i+1])
            return false;
        return issorted(a,i+1);
    }
}
