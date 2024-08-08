package Recurion_Backtracking;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        Power ob=new Power();
        System.out.println(ob.pow(n,x));
    }
    int pow(int a,int b){
        if(b==0)
            return 1;
        return a*pow(a,b-1);
    }

}
