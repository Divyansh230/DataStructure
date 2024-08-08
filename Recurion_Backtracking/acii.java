package Recurion_Backtracking;
import java.util.*;
public class acii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print(s,0,"");
    }
    static void print(String s,int ind,String st){
        if(ind>=s.length()){
            System.out.println(st);
            return ;
        }
        st+=s.charAt(ind);
        print(s,ind+1,st);
        st=st.substring(0,st.length()-1);
        st+=Integer.toString((int)s.charAt(ind));
        print(s,ind+1,st);
        st=st.substring(0,st.length()-1);
        print(s,ind+1,st);
    }
}
