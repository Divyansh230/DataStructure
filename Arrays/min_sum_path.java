package Arrays;
import java.util.*;
public class min_sum_path {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        List<Integer> al=new ArrayList<>();

        sum(grid,0,0,0,al);
        System.out.println(al);
    }
    static void sum(int a[][],int i,int j,int summ,List<Integer> al){
        if(i==a.length-1 && j==a[0].length-1){
            al.add(summ-a[i][j]);
            return ;
        }
        if(i==a.length || j==a[0].length-1)return;
        sum(a,i,j+1,summ+a[i][j],al);
        sum(a,i+1,j,summ+a[i][j],al);
    }
}