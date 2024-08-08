package Assignment;
import java.util.*;
public class Intesection {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        Intesection ob=new Intesection();
        List<Integer> al=new ArrayList<>();
        List<Integer> all=new ArrayList<>();
        ob.intersect(a,b,al,all);
    }
    boolean contain(int n,List<Integer> al){
        int l=0,r=al.size()-1,m=0;
        while(l<r){
            m=(l+r)/2;
            if(al.get(m)==n)return true;
            else if(al.get(m)<n)
                l=m+1;
            else
                r=m-1;
        }
        return false;
    }
    void intersect(int a1[],int a2[],List<Integer> al,List<Integer> all){
        for(int i=0;i<a1.length;i++)
            al.add(a1[i]);
        for(int i=0;i<a2.length;i++)
        {
            if(contain(a2[i],al))
                all.add(a2[i]);
        }
    }
}
