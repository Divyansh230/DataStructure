package Assignment;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LastInd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int num=sc.nextInt();
        System.out.print(last(a,a.length-1,num));
    }
    static int last(int a[],int i,int num){
        if(i<0)
            return -1;
        if(a[i]==num)
            return i;
        return last(a,i-1,num);
    }
}
