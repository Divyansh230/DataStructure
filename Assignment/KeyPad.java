package Assignment;
import java.util.Scanner;
public class KeyPad {
    static String keypad[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void print(String s,String ans){
        if(s.length()==0)
        {
            System.out.println(ans+" ");
            return;
        }
        String let=keypad[Character.getNumericValue(s.charAt(0))-1];
        for(int i=0;i<let.length();i++)
            print(s.substring(1),ans+let.charAt(i));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        KeyPad ob=new KeyPad();
        ob.print(s,"");
    }
}
