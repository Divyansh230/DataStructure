package Recurion_Backtracking.Revision;
import java.util.*;
public class TargetSum {
    public static void main(String args[]){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        TargetSum ob=new TargetSum();
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        int n=sc.nextInt();
        List<List<Integer>> al=new ArrayList<>();
        ob.find(a,0,al,n,new ArrayList<>());
        System.out.println(al);
    }
    void find(int a[],int i,List<List<Integer>> al,int t,List<Integer> ans){
        if(i>=a.length)
        {
            if(t==0)
                al.add(new ArrayList<>(ans));
            return ;
        }
        if(a[i]<=t){
            ans.add(a[i]);
            find(a,i,al,t-a[i],ans);
            ans.remove(ans.size()-1);
        }
        find(a,i+1,al,t,ans);
    }
}
