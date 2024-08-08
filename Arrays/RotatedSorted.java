package Arrays;
import java.util.Scanner;
class RotatedSorted{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RotatedSorted ob=new RotatedSorted();
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(ob.find(a,target));
        }
    int find(int a[],int k){
        int l=0,r=a.length-1,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(a[m]==k)return m;
            if(a[l]<a[m]){
                if(k>=a[l] && k<=a[m])r=m-1;
                else
                    l=m+1;
            }
            else
            {
                if(k>=a[m] && k<=a[r])l=m+1;
                else
                    r=m-1;
            }
        }
        return -1;
    }
}
