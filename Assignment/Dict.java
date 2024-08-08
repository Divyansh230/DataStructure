package Assignment;
import java.sql.SQLOutput;
import java.util.*;
public class Dict {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Dict ob=new Dict();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        s=new String(s);
        TreeSet<String> ans=new TreeSet<>();
        ob.permute(s,0,ans);
        for(String i:ans){
            if(i.compareTo(s)<0)
                System.out.println(i);
        }
    }
    void permute(String s,int i,TreeSet<String> ans){
        if(i==s.length())
        {
            ans.add(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            s=swap(s,i,j);
            permute(s,i+1,ans);
            s=swap(s,i,j);
        }

    }
    String swap(String s,int i,int j){
        char ch[]=s.toCharArray();
        char t=ch[i];
        ch[i]=ch[j];
        ch[j]=t;
        return new String(ch);
    }
}
