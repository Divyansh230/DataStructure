package Recurion_Backtracking;
import java.util.*;
public class All_Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        int b[]=new int[max+1];
        for(int i=0;i<n;i++)
            b[a[i]]++;
        for(int i=0;i<b.length;i++){
            if(b[i]!=0)
                System.out.println("Freq of"+i+"="+b[i]);
        }
    }
}
