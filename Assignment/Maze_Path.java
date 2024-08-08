package Assignment;
import java.util.*;
public class Maze_Path {
    void generate(int a[][],int row,int col,String ans,List<String> al){
        if(row==a.length-1 && col==a[0].length-1)
        {
            al.add(ans);
            return ;
        }
        if(row>=a.length || col>=a.length)return;
        generate(a,row+1,col,ans+"V",al);
        generate(a,row,col+1,ans+"H",al);
        generate(a,row+1,col+1,ans+"D",al);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        Maze_Path ob=new Maze_Path();
        List<String> al=new ArrayList<>();
        ob.generate(mat,0,0,"",al);
        System.out.println(al);


    }
}
