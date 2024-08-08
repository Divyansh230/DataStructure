package Assignment;
import java.util.Scanner;
public class ASci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ab";
        sub(s,"",0);
    }
    static void sub(String s,String ans,int i){
       if(i>=s.length()){
           System.out.print(ans+" ");
           return ;
       }
       sub(s,ans,i+1);
       sub(s,ans+s.charAt(i),i+1);
       sub(s,ans+(int)s.charAt(i),i+1);
    }
}
