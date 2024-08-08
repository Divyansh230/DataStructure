package Binary_Search;
import java.util.*;
class Rotated_Search{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int target=sc.nextInt();
        Rotated_Search ob=new Rotated_Search();
        System.out.println(ob.search(a,target));
    }
    int search(int a[],int x){
        int n=a.length;
        int l=0,h=n-1,m=0;
        while(l<=h){
            m=l+(h-l)/2;
            if(a[m]==x)return m;
            if(a[l]<=a[m]){
                if(a[l]<=x && x<=a[m])
                    h=m-1;
                else
                    l=m+1;
            }
            else{
                if(a[m]<=x && x<=a[h])
                    l=m+1;
                else
                    h=m-1;
            }
        }
        return -1;
    }
}