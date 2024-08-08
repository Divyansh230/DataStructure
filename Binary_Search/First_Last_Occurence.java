package Binary_Search;
import java.util.*;
public class First_Last_Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int c=sc.nextInt();
        First_Last_Occurence ob=new First_Last_Occurence();
        if(ob.first_id(a,c)==-1)System.out.println("Not exists");
        else{
            System.out.println(ob.first_id(a,c)+" "+ob.last_id(a,n));
        }
    }
    int first_id(int a[],int n){
        int l=0,h=a.length-1,m=0,ans=-1;
        while(l<=h){
            m=(l+h)/2;
            if(a[m]==n){
                ans=m;
                h=m-1;
            }
            else if(n<a[m]){
                h=m-1;
            }
            else
                l=m+1;
        }
        return -1;
    }
    int last_id(int a[],int n){
        int l=0,h=a.length-1,m=0,ans=-1;
        while(l<=h){
            m=(l+h)/2;
            if(a[m]==n){
                ans=m;
                l=m+1;
            }
            else if(n<a[m])h=m-1;
            else l=m+1;
        }
        return ans;
    }
}
