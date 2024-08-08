package Revision;
import java.util.*;
public class N_queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]=new int[n][n];
        N_queen ob=new N_queen();
        ob.play(board,0);
    }
    void play(int board[][],int col){
        if(col>=board.length){
            print(board);
            return;
        }
        for(int row=0;row<board.length;row++){

            if(safe(board,row,col)){
                board[row][col]=1;
                play(board,col+1);
                board[row][col]=0;
            }
        }
    }
    boolean safe(int a[][],int row,int col){
        int r=row,c=col;
        while(r>=0 && c>=0){
            if(a[r][c]==1)return false;
            r--;
            c--;
        }
        r=row;
        c=col;
        while(c>=0){
            if(a[r][c]==1)return false;
            c--;
        }
        c=col;
        while(c>=0 && r<a.length){
            if(a[r][c]==1)return false;
            c--;
            r++;
        }
        return true;
    }
    void print(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1) {
                    System.out.print("{" + (i + 1) + "-" + (j + 1) + "}");
                    break;
                }
            }
        }
    }
}
