package Assignment;
import java.util.*;
public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> al = new ArrayList<>();
        Subsequence ob=new Subsequence();
        ob.generate(s, 0, "", al);
        System.out.println(al);
    }

    void generate(String s,int i,String ans,List<String> al){
        if(i>=s.length())
        {
            al.add(ans);
            return ;
        }
        ans=ans+s.charAt(i);
        generate(s,i+1,ans,al);
        ans=ans.substring(0,ans.length()-1);
        generate(s,i+1,ans,al);
    }
}
