package Recurion_Backtracking;
import java.util.*;
public class subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> ans=new ArrayList<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        subsequences ob=new subsequences();
        ob.fill(a,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    void fill(int a[],int i,List<Integer> al,List<List<Integer>> ans){
        if(i>=a.length){
            ans.add(new ArrayList<>(al));
            return ;
        }
        al.add(a[i]);
        fill(a,i+1,al,ans);
        al.remove(al.size()-1);
        fill(a,i+1,al,ans);
    }
}
