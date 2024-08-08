package Stacks;
import java.util.*;
import java.util.Stack;

public class histogram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        histogram ob=new histogram();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int ar=ob.find_max_area(a);
        System.out.println(ar);
    }
    int find_max_area(int a[]){
        int n=a.length;
        Stack<Integer>st=new Stack<>();
        int nse[]=new int[n];
        int pse[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[st.peek()]>=a[i])st.pop();
            if(st.isEmpty())pse[i]=0;
            else pse[i]=st.peek()+1;
            st.push(i);
        }
        while(!st.isEmpty())st.pop();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()]>=a[i])st.pop();
            if(st.isEmpty())nse[i]=n-1;
            else nse[i]=st.peek()-1;
            st.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++)
            max=Math.max(max,a[i]*(nse[i]-pse[i]+1));
        return max;
    }
}
