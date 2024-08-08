package Binary_Search;
import java.util.*;

public class Lower_bound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={5,6,7,2,3,1,6};
        Arrays.sort(a);
        Lower_bound ob=new Lower_bound();
        System.out.println(ob.find_lower_bound(a,5));
    }
    int find_lower_bound(int a[],int trgt){
        int l=0,u=a.length-1,m=0,ans=a.length;
        while(l<=u){
            m=(l+u)/2;
            if(a[m]>=trgt){
                ans=a[m];
                u=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}
