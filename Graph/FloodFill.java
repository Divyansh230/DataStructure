package Graph;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int grid[][]={{1,1,1},{1,1,0},{1,0,1}};
        int ans[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=grid[i][j];
            }
        }
        dfs(0,0,ans,grid,2,1);
        for(int i=0;i<ans.length;i++)
        System.out.println(Arrays.toString(ans[i]));
    }
    static void dfs(int row, int col, int ans[][], int image[][], int newColor, int prevColor) {
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == prevColor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, prevColor);
            }
        }
    }

}
