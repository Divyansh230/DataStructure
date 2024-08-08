package Binary_Search;
import java.util.*;

public class bin_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bin_search ob = new bin_search();
        System.out.println(ob.search(a, 4));
    }

    int search(int a[], int target) {
        int n = a.length;
        int l = 0, h = n - 1, m = -1;
        while (l <= h) {
            m = (l + h) / 2;
            if (target == a[m]) {
                return m;
            }
            if (target > a[m]) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return -1;
    }
}
