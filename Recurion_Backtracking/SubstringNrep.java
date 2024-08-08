package Recurion_Backtracking;
import java.util.*;
public class SubstringNrep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print(s,0,"");
    }
    static void print(String s,int i,String ans){
        if(i>=s.length())
        {
            System.out.print(ans+" ");
            return ;
        }
        for(int j=i;j<s.length();j++)
        {
            if(j>i && s.charAt(j)==s.charAt(j-1))
                continue;
            ans+=s.charAt(j);
            print(s,j+1,ans);
            ans=ans.substring(0,ans.length()-1);
        }
    }
}
