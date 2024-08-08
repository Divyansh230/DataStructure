package Recurion.Backtracking.Revision;

import java.util.*;

class TargetSum2{
    public static void main(String args[]){
        int a[]={1,4,6,5,3};
        Arrays.sort(a);
        int target=10;
        //List<List<Integer>> l=new ArrayList<>();
        print(a,0,target,new ArrayList<>());
        //System.out.println(l);
    }
    static void print(int a[],int i,int x,List<Integer> al){
        if(x==0)
        {
            System.out.print(al+" ");;
            return ;
        }
        for(int j=i;j<a.length;j++)
        {
            if(j>i && a[j-1]==a[j])continue;
            if(a[j]>x)break;
            al.add(a[j]);
            print(a,j+1,x-a[j],al);
            al.remove(al.size()-1);
        }
    }
}