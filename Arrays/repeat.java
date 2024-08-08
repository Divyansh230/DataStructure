package Arrays;
import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(check_repeat(i)) c++;
        }
        System.out.println(c);
        
    }

    static boolean check_repeat(int n){
        String s=Integer.toString(n);
        char ch[]=s.toCharArray();
        int max = Character.getNumericValue(ch[0]);
        for(int i=0;i<ch.length;i++){
            int t = Character.getNumericValue(ch[i]);
            if(t > max) max = t;
        }
        int freq[]=new int[max+1];
        for(int i=0;i<ch.length;i++){
            int t = Character.getNumericValue(ch[i]);
            freq[t]++;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>1) return true;
        }
        return false;
    }
}
