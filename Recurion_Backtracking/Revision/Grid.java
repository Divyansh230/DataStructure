package Recurion_Backtracking.Revision;

import java.util.*;
public class Grid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        List<String> al=new ArrayList<>();
        fill(mat,0,0,"",al);
        for(String i:al){
            for(String j:al){
                System.out.print(i+"V"+j+" ");
            }
        }
    }
    static void fill(int a[][],int r,int c,String ans,List<String> al){
        if(r==a.length && c==a[0].length)
        {
            al.add(ans);
            return ;
        }
        if(r>a.length || c>a[0].length)return;
        fill(a,r+1,c,ans+"V",al);
        fill(a,r,c+1,ans+"H",al);
        fill(a,r+1,c+1,ans+"D",al);
    }
}
