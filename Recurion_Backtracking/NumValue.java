import java.util.*;

public class NumValue {

    public static void main(String[] args) {
        char[] a = new char[26];
        int k = 0;
        for (char i = 'a'; i <= 'z'; i++)
            a[k++] = i;

        Scanner sc = new Scanner(System.in);
        List<String> al = new ArrayList<>();
        String s = sc.next();
        printsub(s, 0, al, "");
        for (String i : al) {
            if (!i.isEmpty()&&Integer.parseInt(i)<=26) // Only print non-empty substrings
                System.out.print(a[Integer.parseInt(i) - 1]);
            System.out.print(" ");
        }
    }

    static void printsub(String s, int i, List<String> al, String ans) {
        if (i >= s.length()) {
            al.add(ans);
            return;
        }
        ans = ans + s.charAt(i);
        printsub(s, i + 1, al, ans);
        ans = ans.substring(0, ans.length() - 1);
        printsub(s, i + 1, al, ans);
    }
}
