class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                
                if(grid[i][j]==1){

                    ans = Math.max(ans, helper(grid, i, j));
                }
            }
        }
        return ans;
    }
    int helper(int[][] grid, int i ,int c){
        
        if(grid[i][c]!=1) return 0;
        grid[i][c]=-1;
        
        int count = 1;
        
        if(i<grid.length-1){count+=helper(grid, i+1, c);};
        if(i>0)            {count+=helper(grid, i-1, c);};
        if(c<grid[0].length-1){count+=helper(grid, i, c+1);};
        if(c>0){ count+=helper(grid, i, c-1);};
        return count;
        
        
        
    }
}