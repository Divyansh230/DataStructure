package Recurion_Backtracking.Revision;

import java.util.*;

public class Powerst {
    static void print(int a[], int i, List<Integer> al){
        if(i==a.length)
        {
            System.out.println(al);
            return ;
        }
        if(i>a.length)return ;
        for(int k=i;k<a.length;k++)
        {
            al.add(a[k]);
            print(a,k+1,al);
            al.remove(al.size()-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]={1,1,2,3};
        List<Integer> al=new ArrayList<>();
        print(x,0,al);
    }
}
