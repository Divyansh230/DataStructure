package Assignment;
import java.util.*;
public class Nth_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int  sum(int n){
        if(n==0)
            return 0;
        return n+sum(n-1);
    }
}
