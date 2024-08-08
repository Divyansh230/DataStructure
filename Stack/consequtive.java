package Stack;
import java.util.*;
public class consequtive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        int res[]=remove(a);
        System.out.println(Arrays.toString(res));
    }
    static int[] remove(int a[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            if (st.isEmpty() || st.peek() != a[i]) {
                st.push(a[i]);
            }
            if (!st.isEmpty() && st.peek() == a[i]) {
                if (i == a.length - 1 || a[i] != a[i + 1]) {
                    st.pop();
                }
            }
        }
        int res[] = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.peek();
            st.pop();
        }
        return res;
    }

}
