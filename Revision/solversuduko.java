package Revision;
import java.util.Scanner;
public class solversuduko {
    public static void main(String[] args) {
        solversuduko ob=new solversuduko();
        Scanner sc=new Scanner(System.in);
        int board[][]=new int[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
                board[i][j]=sc.nextInt();
        }
        if(ob.solver(board)){
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                    System.out.print(board[i][j]+" ");
                System.out.println();
            }
        }
    }
    boolean solver(int a[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            {
                if(a[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(valid(a,i,j,k)){
                            a[i][j]=k;
                            if(solver(a))return true;
                            else a[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean valid(int a[][],int r,int c,int v){
        for(int i=0;i<9;i++){
            if(a[i][c]==v)return false;
            if(a[r][i]==v)return false;
            if(a[3*(r/3)+i/3][3*(c/3)+i%3]==v)return false;
        }
        return true;
    }
}
