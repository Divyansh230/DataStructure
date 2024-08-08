package Recurion_Backtracking;
import java.util.Scanner;
class Keypad
{
     String keypad[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Keypad ob=new Keypad();
        ob.print(s,"");
    }
    void print(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return ;
        }
         char ch=s.charAt(0);
        String x=keypad[Character.getNumericValue(ch)-1];
        for(int i=0;i<x.length();i++)
            print(s.substring(1),ans+x.charAt(i));
    }
}