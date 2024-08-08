package Assignment;
import java.util.*;
public class Maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        List<String> al=new ArrayList<>();
        generate(mat,0,0,"",al);
        System.out.println(al);
    }
    static void generate(int a[][],int row,int col,String s,List<String> al){
        if(row==a.length-1 && col==a[0].length){
            al.add(s);
            return;
        }
        if(row>=a.length || col>=a.length)return ;
        generate(a,row+1,col,s+"V",al);
        generate(a,row,col+1,s+"H",al);
    }
}
