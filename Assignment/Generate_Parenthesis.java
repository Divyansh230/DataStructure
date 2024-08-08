package Assignment;
import java.util.*;
public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> al=new ArrayList<>();
        generate(n,n,"",al);
        System.out.println(al);
    }
    static void generate(int l,int r,String ans,List<String> al){
        if(l==0 && r==0){
            al.add(ans);
            return ;
        }
        if(l>0)
            generate(l-1,r,ans+"(",al);
        if(r>l && r>0)
            generate(l,r-1,ans+")",al);
    }
}

