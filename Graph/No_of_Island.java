package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class No_of_Island {
    public static void main(String[] args) {
        int grid[][] = {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 1}};
        No_of_Island ob = new No_of_Island();
        int n = grid.length;
        int m = grid[0].length;
        int visit[][] = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visit[i][j] == 0 && grid[i][j] == 1) {
                    ob.bfs(grid, i, j, visit);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    void bfs(int grid[][], int row, int col, int visit[][]) {
        visit[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()) {
            int ro = q.peek().first;
            int co = q.peek().second;
            q.remove();
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int nro = ro + i;
                    int nco = co + j;
                    if (nro >= 0 && nro < n && nco >= 0 && nco < m && grid[nro][nco] == 1 && visit[nro][nco] == 0) {
                        q.add(new Pair(nro, nco));
                        visit[nro][nco] = 1;
                    }
                }
            }
        }
    }
}
