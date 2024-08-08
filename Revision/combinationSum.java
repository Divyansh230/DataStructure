package Revision;

import java.util.*;

public class combinationSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        combinationSum ob=new combinationSum();
        ob.combine(a,0,target,new ArrayList<>());
    }
    void combine(int a[],int i,int k,List<Integer> al){
        if(i>=a.length){
            if(k==0){
                System.out.print(al+" ");

            }
            return ;
        }
        if(a[i]<k){
            al.add(a[i]);
            combine(a,i,k-a[i],al);
            al.remove(al.size()-1);
        }
        else combine(a,i+1,k,al);
    }
}
