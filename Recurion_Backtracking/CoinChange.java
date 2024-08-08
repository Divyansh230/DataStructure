package Recursion_Backtracking;
import java.util.*;
class CoinChange
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,5,10};
        int sum=sc.nextInt();
        CoinChange ob=new CoinChange();
        ob.Change(a,0,sum,new ArrayList<>());
    }
    void Change(int a[],int i,int sum,List<Integer> al){
        if(i>=a.length)
        {
            if(sum==0)
                System.out.print(al+" ");
            return ;
        }
        if(a[i]<=sum){
            al.add(a[i]);
             Change(a,i,sum-a[i],al);
             al.remove(al.size()-1);
        }
        Change(a,i+1,sum,al);
    }
}
