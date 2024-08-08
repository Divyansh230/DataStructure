package Revision;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        int n = sc.nextInt();
        int cnt[] = new int[1];
        int board[][] = new int[n][n];
        ob.solve(board, 0, cnt);
        System.out.print("\n" + cnt[0]);
    }

    void solve(int board[][], int col, int c[]) {
        if (col >= board.length) {
            print(board);
            System.out.print(" ");
            c[0]++;
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                solve(board, col + 1, c);
                board[row][col] = 0;
            }
        }
    }

    boolean isSafe(int a[][], int r, int c) {
        // Check if there's a queen in the same row
        for (int i = 0; i < c; i++) {
            if (a[r][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (int i = r, j = c; i < a.length && j >= 0; i++, j--) {
            if (a[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    System.out.print("{" + (i + 1) + "-" + (j + 1) + "} ");
                    break;
                }
            }
        }
    }
}

