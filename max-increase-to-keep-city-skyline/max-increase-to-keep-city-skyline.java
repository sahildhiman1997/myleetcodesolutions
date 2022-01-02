
public class Solution {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        int[] maxRows = new int[n];
        int[] maxcolumns = new int[n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                maxRows[r]  = Math.max( maxRows[r], grid[r][c]);
                maxcolumns[c]  = Math.max(maxcolumns[c], grid[r][c]);
            }
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                sum += Math.min(maxRows[r], maxcolumns[c]) - grid[r][c];
            }
        }
        return sum;

    }
}