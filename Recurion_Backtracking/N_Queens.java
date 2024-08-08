package Recurion_Backtracking;

import java.util.*;
class N_Queens{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]=new int[n][n];
        N_Queens ob=new N_Queens();
        ob.dfs(board,0);
    }
    void dfs(int a[][],int i){
        if(i==a.length)
        {
            print(a);
            return ;
        }
        for(int row=0;row<a.length;row++)
        {
            if(safe(a,row,i)){
                a[row][i]=1;
                dfs(a,i+1);
                a[row][i]=0;
            }
        }
    }
    boolean safe(int a[][],int i,int j){
        int x=i,y=j;
        while(x>=0 && y>=0){
            if(a[x][y]==1)return false;
            x--;
            y--;
        }
        x=i;
        y=j;
        while(y>=0 && x<a.length){
            if(a[x][y]==1)return false;
            y--;
            x++;
        }
        x=i;
        y=j;
        while(y>=0){
            if(a[x][y]==1)return false;
            y--;}
        return true;

    }
    void print(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j]==1)
                    System.out.print("{"+(i+1)+"-"+(j+1)+"} ");
            }
            System.out.print("  ");
        }
    }
}
