package Assignment;
import java.util.Scanner;
public class HI {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(remove(s,0));
    }
    static String remove(String s,int i){
        if(i>=s.length()-1)
            return s;
        if(s.charAt(i)=='h' && s.charAt(i+1)=='i' &&(i==s.length()-2||s.charAt(i+2)!='t'))
            return remove(s.substring(0,i)+s.substring(i+2),i);
        return remove(s,i+1);
    }
}
