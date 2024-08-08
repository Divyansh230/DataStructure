package Assignment;
import java.util.*;
public class Hardoi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,'A','B','C');
    }
    static void print(int n,char s,char d,char aux){
        if(n==1){
            System.out.print("Moving ring 1 from "+s+" to "+d);
            return ;
        }
        print(n-1,s,aux,d);
        System.out.print("Moving ring "+n+"from"+s+"to"+d);
        print(n-1,aux,s,d);
    }
}
