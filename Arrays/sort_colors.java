package Arrays;
import java.util.*;
public class sort_colors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
    }
    public void sort(int a[]){
        int l=0,m=0,r=a.length-1;
        while(m<=r)
        {
            if(a[m]==0){
                swap(a,m,l);
                m++;l++;

            }
            else if(a[m]==1)
                m++;
            else{
                swap(a,m,r);
                r--;
            }
        }
    }
    void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
