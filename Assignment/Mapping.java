package Assignment;
import java.util.*;
public class Mapping {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        List<String> ans=new ArrayList<>();
        int s=sc.nextInt();
        print(s,"",ans);
        Collections.sort(ans);
        for(String st:ans)
            System.out.println(st);
    }
    static void print(int n,String s,List<String> ans){
        if(n==0){
            ans.add(s);
            return ;
        }
        if(n%10!=0)
        {
            char c=(char)('A'+n%10-1);
            print(n/10,c+s,ans);
        }
        if(n>10 && n%100>=10 && n%100<=26)
        {
            char c=(char)('A'+(n%100)-1);
            print(n/100,c+s,ans);
        }
    }
}
