package Assignment;

import java.util.Scanner;

public class Lexographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(0+" ");
        for(int i=1;i<=9;i++)
            lexo(i,n);
    }
    static void lexo(int x,int n){
        if(x>n)return;
        System.out.print(x+" ");
        for(int i=0;i<=9;i++)
            lexo(x*10+i,n);
    }
}
