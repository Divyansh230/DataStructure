package Assignment;
import java.util.Scanner;
public class FirstInd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int f=sc.nextInt();
        System.out.println(find(a,0,f));
    }
    static int find(int a[],int i,int x){
        if(i>=a.length)return -1;
        if(a[i]==x)return x;
        return find(a,i+1,x);
    }
}
