package Recurion_Backtracking;
import java.util.*;
public class subsequence2 {
    static void subset(int a[],int ind,List<Integer> al){
        if(ind>=a.length)
        {
            System.out.print(al+" ");
            return ;
        }
        for(int i=ind;i<a.length;i++)
        {
            if(i>ind && a[i]==a[i-1])continue;
            al.add(a[i]);
            subset(a,i+1,al);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        subset(a,0,new ArrayList<>());
    }
}
