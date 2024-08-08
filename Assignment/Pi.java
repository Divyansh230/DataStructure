package Assignment;

import java.util.Scanner;

public class Pi {
    String rep(String s) {
        if (s.length() <= 1)
            return s;
        if (s.startsWith("pi"))
            return "3.14" + rep(s.substring(2));
        return s.charAt(0) + rep(s.substring(1));
    }

    public static void main(String[] args) {
        Pi ob = new Pi();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String j = sc.next();
            System.out.println(ob.rep(j));
        }
    }
}
