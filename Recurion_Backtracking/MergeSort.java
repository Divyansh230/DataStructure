package Recursion_Backtracking;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort ob=new MergeSort();

        //Scanner sc = new Scanner(System.in);
       // int n=sc.nextInt();
       // int a[]=new int[n];
        int a[]={12,6,4,1,2};
        /*for(int i=0;i<5;i++)
            a[i]=sc.nextInt();*/
        ob.divide(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }
    void divide(int a[],int l,int h){
       if(l>=h)return ;
       int m=l+(h-l)/2;
       divide(a,l,m);
       divide(a,m+1,h);
       merge(a,l,m,h);
    }
    void merge(int a[],int l,int m,int h){
        List<Integer> temp=new ArrayList<>();
        int left=l;
        int right=m+1;
        while(left<=m && right<=h){
            if(a[left]<a[right])
            {
                temp.add(a[left]);
                left++;
            }
            else {
                temp.add(a[right]);
                right++;
            }
        }
        while(left<=m)
        {
            temp.add(a[left]);
            left++;
        }
        while(right<=h)
        {
            temp.add(a[right]);
            right++;
        }
        for(int i=l;i<=h;i++)
            a[i]=temp.get(i-l);
    }
}