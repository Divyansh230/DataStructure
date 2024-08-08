package Recurion_Backtracking;
import java.util.*;
public class generate_Parenthesis {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generate(n,n,"");
    }
    static void generate(int i,int j,String ans){
        if(i==0 && j==0)
        {
            System.out.println(ans);
            return ;
        }
        if(i>0)
            generate(i-1,j,ans+"(");
        if(j>0 && j>i)
            generate(i,j-1,ans+")");
    }
}
