package Stacks;
import java.util.*;
import java.util.Stack;
public class NextGreater {
    public static void main(String[] args) {
        int a[]=new int[11];
        int n=a.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        Arrays.fill(nge,-1);
        for(int i=0;i<2*n;i++){
            int num=a[i%n];
            while(!st.isEmpty() && st.peek()<num)a[st.pop()]=num;
            if(i<n)st.push(i);
        }
    }
}
