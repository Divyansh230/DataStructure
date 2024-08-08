package Assignment;
import java.util.*;
public class Boardpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        List<String> al=new ArrayList<>();
        generate(n,m,"",al);
        System.out.println(al);
    }

    static void generate(int n,int m,String ans,List<String> al){
        if(n==0)
        {
            al.add(ans);
            return ;
        }
        for(int i=1;i<=n && i<=m;i++)
            generate(n-i,m,ans+i,al);
    }

}
