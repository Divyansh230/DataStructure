package Assignment;
import java.util.*;
public class Subset_Problem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Subset_Problem ob=new Subset_Problem();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        int target=sc.nextInt();
        List<String> al=new ArrayList<>();
        ob.generate(a,0,"",al,target);
        System.out.println(al);
    }
    void generate(int a[],int i,String ans,List<String> al,int x){
        if(x==0)
        {
            al.add(ans);
            return ;
        }
        for(int j=i;j<a.length;j++)
        {
            if(j>i && a[j-1]==a[j])continue;
            if(x<a[j])break;
            ans=ans+a[j];
            generate(a,j+1,ans,al,x-a[j]);
            ans=ans.substring(0,ans.length()-1);
        }
    }
}
