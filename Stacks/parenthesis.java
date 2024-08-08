package Stacks;
import java.util.*;
import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        parenthesis ob=new parenthesis();
        System.out.println(ob.isValid(s));
    }
    boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')st.push(ch);
            else if(!st.empty() && st.peek()=='(' && ch==')')st.pop();
            else if(!st.empty() && st.peek()=='{' && ch=='}')st.pop();
            else if(!st.empty() && st.peek()=='[' && ch==']')st.pop();
            else break;
        }
        return st.empty();
    }
}
