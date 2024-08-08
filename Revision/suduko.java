package Revision;

import java.util.Scanner;

public class suduko {
    public static void main(String args[]) {
        suduko ob = new suduko();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                a[i][j] = sc.nextInt();
        }
        boolean t = ob.solve(a);
        if (t) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }

    boolean solve(int a[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (valid(a, i, j, k)) {
                            a[i][j] = k;
                            if (solve(a))
                                return true;
                            else
                                a[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean valid(int a[][], int r, int c, int n) {
        for (int i = 0; i < 9; i++) {
            if (a[i][c] == n)
                return false;
            if (a[r][i] == n)
                return false;
            if (a[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == n)
                return false;
        }
        return true;
    }
}
