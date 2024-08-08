package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class sum3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sum3 ob=new sum3();
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        List<List<Integer>> ls=ob.find(a);
        System.out.println(ls);
    }
    List<List<Integer>> find(int a[]){
        Arrays.sort(a);
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(i>0 && a[i]==a[i-1])continue;
            int l=0;
            int r=a.length-1;
            while(l<r){
                int sum=a[i]+a[l]+a[r];
                if(sum<0)l++;
                else if(sum>0)r++;
                else{
                    al.add(Arrays.asList(a[i],a[l],a[r]));
                    while(l<r && a[l]==a[l+1])l++;
                    while(l<r && a[r]==a[r-1])r--;
                    l++;
                    r--;
                }
            }
        }
        return al;
    }
}