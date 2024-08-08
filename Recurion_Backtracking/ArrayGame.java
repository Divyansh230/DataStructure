package Recurion_Backtracking;

import java.util.Scanner;

public class ArrayGame {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayGame ob=new ArrayGame();
        int n=ob.sc.nextInt();
        int a[]=new int[n];
        ob.initialize(a,0);
        ob.printfirst(a,0);
        System.out.println();
        ob.printlast(a,0);
    }
    void initialize(int a[],int i){
        if(i==a.length)
            return ;
        a[i]=sc.nextInt();
        initialize(a,i+1);

    }
    void printfirst(int a[],int i)
    {
        if(i==a.length)
            return ;
        System.out.print(a[i]+" ");
        printfirst(a,i+1);

    }
    void printlast(int a[],int i){
        if(i==a.length)
            return ;
        printlast(a,i+1);
        System.out.print(a[i]+" ");
    }
}
