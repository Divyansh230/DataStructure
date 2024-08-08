package Assignment;

public class test {
    static void dfs(int n,String s)
    {
        if(n==0)
        {
            System.out.print(s+" ");
            return ;
        }
        if(n%10!=0)
        {
            char ch=(char)('A'+n%10-1);
            dfs(n/10,s+ch);
        }
        if(n>10 && n%100>=10 && n%10<=26){
            char ch=(char)('A'+n%100-1);
            dfs(n/100,s+ch);
        }
    }

    public static void main(String[] args) {
        dfs(1123,"");
    }
}
