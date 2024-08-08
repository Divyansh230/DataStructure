package Assignment;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       OddEven ob=new OddEven();
       ob.printodd(n);
       ob.printevem(n);
    }
    void printodd(int n){
        if(n<1)return;
        if(n%2!=0)
            System.out.println(n);
        printodd(n-1);
    }
    void printevem(int n){
        if(n<1)return ;
        printevem(n-1);
        if(n%2==0)
            System.out.println(n);
    }
}
