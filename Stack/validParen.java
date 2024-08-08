package Stack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class validParen {
    public static void main(String[] args) {
        List<Character> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                al.add(c);
            else if(c==')' && al.size()!=0 && al.get(al.size()-1)=='(')
                al.remove(al.size()-1);
            else if(c=='}' && al.size()!=0 && al.get(al.size()-1)=='{')
                al.remove(al.size()-1);
            else if(c==']' && al.size()!=0 && al.get(al.size()-1)=='[')
                al.remove(al.size()-1);
            else
                break;
        }
        if(al.size()==0)System.out.println("True");
        else
        System.out.println("False");
    }
}
