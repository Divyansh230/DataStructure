package Recurion_Backtracking.Revision;
import java.util.*;
public class Subsequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        List<List<Integer>> al=new ArrayList<>();
        Subsequence ob=new Subsequence();
        ob.subset(a,0,new ArrayList<>(),al);
        for(List<Integer> i:al){
            System.out.print(i+" ");
        }
    }
    void subset(int a[],int i,List<Integer> ans,List<List<Integer>> al){
        if(i>=a.length)
        {
            al.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(a[i]);
        subset(a,i+1,ans,al);
        ans.remove(ans.size()-1);
        subset(a,i+1,ans,al);
    }


}
