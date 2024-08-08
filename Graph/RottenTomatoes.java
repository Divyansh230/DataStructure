package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pairs {
    int row;
    int col;
    int _tm;

    Pairs(int i, int j, int t) {
        row = i;
        col = j;
        _tm = t;
    }
}

public class RottenTomatoes {
    public static void main(String[] args) {
        int basket[][] = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int m = basket.length;
        int n = basket[0].length;
        Queue<Pairs> q = new LinkedList<>();
        int visit[][] = new int[m][n];
        int cntfresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (basket[i][j] == 2) {
                    q.add(new Pairs(i, j, 0));
                    visit[i][j] = 2;
                }
                if (basket[i][j] == 1) cntfresh++;
            }
        }
        int tm = 0;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek()._tm;
            q.remove();
            tm = Math.max(tm, t);
            for (int i = 0; i < 4; i++) {
                int ro = r + drow[i];
                int co = c + dcol[i];
                if (ro >= 0 && ro < m && co >= 0 && co < n && basket[ro][co] == 1 && visit[ro][co] == 0) {
                    q.add(new Pairs(ro, co, t + 1));
                    visit[ro][co] = 2;
                    cntfresh--; // Decrement cntfresh only for fresh oranges
                }
            }
        }
        if (cntfresh == 0) System.out.println("Saad Gya hai "+tm);
        else System.out.println("Ok-Ok");
    }
}
