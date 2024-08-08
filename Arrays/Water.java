package Arrays;
import java.util.*;
public class Water {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Water ob=new Water();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int y=ob.find_area(a);
        System.out.println(y);
    }
    int find_area(int a[]){
        int l=0,r=a.length-1,max_ar=0;
        while(l<r){
            int cur_ar=Math.min(a[l],a[r])*(r-l);
            max_ar=Math.max(max_ar,cur_ar);
            if(a[l]<a[r])
                l+=1;
            else
                r-=1;
        }
        return max_ar;
    }
}
