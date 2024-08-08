package Recurion_Backtracking;
import java.util.Scanner;

public class Coin2 {
    static void toss(int n,String ans){
        if(n==0){
            for(int i=0;i<ans.length()-1;i++)
                if(ans.charAt(i)==ans.charAt(i+1))
                    return ;
            System.out.print(ans+" ");
            return;

        }
        toss(n-1,ans+'H');
        toss(n-1,ans+'T');
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toss(n,"");
    }
}
