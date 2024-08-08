package Assignment;

import java.util.Scanner;

public class R05 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        s=s.replace("0","5");
        System.out.println(s);
    }

}
