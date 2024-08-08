package Recurion_Backtracking;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime ob=new Prime();
        for(int i=1;i<=n;i++){
         if(ob.prime(i,2)){
        System.out.print(i+" ");}}
    }
    ;
    boolean prime(int n,int f){
        if(f>n/2)
            return true;
        else if(n%f==0)
            return false;
        else
        {
            ;
            return prime(n,f+1);
        }
    }
}
