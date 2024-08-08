package Assignment;
import java.util.*;
class Recursive_Twin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(count(s,0));
    }
    static int count(String s,int i){
        if(i>=s.length()-2)
            return 0;
        if(s.charAt(i)==s.charAt(i+2))return 1+count(s,i+1);
        return count(s,i+1);
    }
}