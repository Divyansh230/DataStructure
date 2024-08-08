package Binary_Search;

import java.util.Scanner;

public class Rotated_Array_min {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Rotated_Array_min ob=new Rotated_Array_min();
        System.out.println(ob.find_min(a));
    }
    int find_min(int a[]){
        int l=0,h=a.length-1,m=0,ans=Integer.MAX_VALUE;
        while(l<=h){
            m=l+(h-l)/2;
            if(a[l]<=a[m]){
                ans=Math.min(ans,a[l]);
                l=m+1;
            }
            else{
                ans=Math.min(ans,a[m]);
                h=m-1;
            }
        }
        return ans;
    }

}
