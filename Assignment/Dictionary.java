package Assignment;
import java.util.*;
public class Dictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        s=new String(ch);
        Dictionary ob=new Dictionary();
        List<String> al=new ArrayList<>();
        ob.permute(s,0,al);
        System.out.println(al);
        Collections.sort(al);
        for(String i:al){
            if(i.compareTo(s)<0)
                System.out.print(i+" ");;
        }
    }
    void permute(String s,int i,List<String> al){
        if(i==s.length())
        {
            al.add(s);
            return ;
        }
        for(int j=i;j<s.length();j++)
        {
            s=swap(s,i,j);
            permute(s,i+1,al);
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
