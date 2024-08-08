package Recurion_Backtracking;
import java.util.*;
public class sum1_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum1_n ob=new sum1_n();
        System.out.println(ob.sum(n));
    }
    int sum(int n){
        if(n==0)
            return 0;
        return n+sum(n-1);
    }

}
