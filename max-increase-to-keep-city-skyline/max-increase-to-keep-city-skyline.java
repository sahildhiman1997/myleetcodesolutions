class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
      int sum = 0;
        int n = grid.length;
        int[] maxRows = new int[n];
        int[] maxcolumns = new int[n];
        
        for (int r =0; r<n;r++){
            int maxx=0;
            for(int c = 0;c<n;c++){
                    maxx=Math.max(maxx, grid[r][c]);
            }
            maxRows[r]=maxx;
        }
        
        for (int c =0; c<n;c++){
            int maxx=0;
            for(int r = 0;r<n;r++){
                    maxx=Math.max(maxx, grid[r][c]);
            }
            maxcolumns[c]=maxx;
        }
        
        for (int r =0; r<n;r++){  
            for(int c = 0;c<n;c++){
                     sum += Math.max(Math.min(maxRows[r], maxcolumns[c]), grid[r][c]) - grid[r][c];
            }
        }
        return sum;
        
    }
}