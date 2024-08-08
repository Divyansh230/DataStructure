package Arrays;
import java.util.Arrays;
import java.util.Scanner;

class First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        First_Last ob = new First_Last();
        int a[] = new int[5];
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int[2];
        ar[0] = ob.bin_search(a, k, true);
        if (ar[0] != -1) {
            ar[1] = ob.bin_search(a, k, false);
        }
        System.out.println(Arrays.toString(ar));
    }

    int bin_search(int a[], int k, boolean mark) {
        int l = 0, r = a.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (k < a[m]) r = m - 1;
            else if (k > a[m]) l = m + 1;
            else {
                ans = m;
                if (mark) r = m - 1;
                else l = m + 1;
            }
        }
        return ans;
    }
}
