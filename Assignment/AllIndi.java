package Assignment;
import java.util.*;
public class AllIndi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int num=sc.nextInt();
        List<Integer> al=new ArrayList<>();
        find(a,0,num,al);
        System.out.println(al);
    }
    static void find(int a[],int i,int num,List<Integer> al){
        if(i>=a.length)
            return ;
        if(a[i]==num)
            al.add(i);
        find(a,i+1,num,al);
    }
}
