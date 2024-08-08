package Recurion_Backtracking.Revision;

import java.util.*;

public class Susbsequence2 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        Susbsequence2  ob=new Susbsequence2 ();
        List<List<Integer>> al=new ArrayList<>();
        ob.print(a,0,new ArrayList<>(),al);
        System.out.print(al);
    }
    void print(int a[],int ind,List<Integer> ans,List<List<Integer>> al){
        if(ind>=a.length)
        {
            al.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<a.length;i++)
        {
            if(i>ind && a[i]==a[i-1])continue;
            ans.add(a[i]);
            print(a,i+1,ans,al);
            ans.remove(ans.size()-1);
        }
    }


}
