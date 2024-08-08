package Recurion_Backtracking.Revision;

import java.util.Scanner;

public class Bracket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generate(n,n,"");
    }
    static void generate(int l,int r,String ans){
        if(l==0 && r==0)
        {
            System.out.println(ans);
            return ;
        }
        if(l>0)
            generate(l-1,r,ans+"(");
        if(r>l && r>0)
            generate(l,r-1,ans+")");
    }
}
