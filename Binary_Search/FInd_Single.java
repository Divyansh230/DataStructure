package Binary_Search;
import java.util.*;
public class FInd_Single {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        FInd_Single ob=new FInd_Single();
        System.out.println(ob.single(a));
    }
    int single(int a[]){
        int n=a.length;
        if(n==1)return a[0];
        if(a[1]!=a[0])return a[0];
        if(a[n-1]!=a[n-2])return a[n-1];
        int l=1,h=n-1,m=0;
        while(l<=h){
            m=l+(h-l)/2;
            if(a[m]!=a[m-1] && a[m]!=a[m+1]){
                return a[m];
            }
            if((m%2!=0 && a[m]==a[m-1])||(m%2==0 && a[m]==a[m+1])){
                l=m+1;
            }
            else
                h=m-1;
        }
        return -1;
    }
}
