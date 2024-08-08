package Recurion_Backtracking;
import java.util.*;
public class quickSort {
    public static void main(String[] args) {
        int a[]={77,5,21,0,4};
        quickSort ob=new quickSort();
        ob.quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    void quick(int a[],int low,int high){
        if(low<high){
            int pi=fun(a,low,high);
            quick(a,low,pi-1);
            quick(a,pi+1,high);
        }

    }
    void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    int fun(int a[],int l,int h){
        int pivot = a[l];
        int i = l;
        int j = h;

        while (i < j) {
            while (a[i] <= pivot && i <= h - 1) {
                i++;
            }

            while (a[i] > pivot && j >= l + 1) {
                j--;
            }
            if (i < j) {
                swap(a,i,j);
            }
        }
        swap(a,i,j);
        return j;
    }

}
