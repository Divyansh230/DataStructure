package Recurion_Backtracking;
import java.util.*;
public class Substring {
    void substring(String s,int i,String ans){
        if(i>=s.length())
        {
            System.out.print(ans+" ");
            return ;
        }
        ans=ans+s.charAt(i);
        substring(s,i+1,ans);
        ans=ans.substring(0,ans.length()-1);
        substring(s,i+1,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Substring ob=new Substring();
        ob.substring(s,0,"");
    }
}
