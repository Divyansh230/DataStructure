package Arrays;
import java.util.*;
class sum3close
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sum3close ob=new sum3close();
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(ob.find(a,target));
    }
    int find(int a[],int k){
        Arrays.sort(a);
        int closet=Integer.MAX_VALUE;
        int mindff=Integer.MAX_VALUE;
        for(int i=0;i<a.length-2;i++)
        {
            int l=0,r=a.length-1;
            while(l<r){
                int sum=a[l]+a[r]+a[i];
                int dff=sum-k;
                if(dff==0)return sum;
                if(dff<mindff)
                {
                    mindff=dff;
                    closet=sum;
                }
                if(sum<k)l++;
                else r--;
            }
        }
        return closet;
    }
}