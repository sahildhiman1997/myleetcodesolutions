class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int ans = 0;
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ans = Math.max(ans, getSize(grid, i, j));
                }
            }
        }
       
        return ans;
    }
    
   int getSize(int[][] grid,int i, int j){
       int size = 1;
       grid[i][j]=0;
       
       if(i<grid.length-1 && grid[i+1][j]==1) size+=getSize(grid, i+1,j);
       if(i>0 && grid[i-1][j]==1) size+=getSize(grid, i-1,j);
       
       if(j<grid[0].length-1 && grid[i][j+1]==1) size+=getSize(grid, i,j+1);
       if(j>0 && grid[i][j-1]==1) size+=getSize(grid, i,j-1);
       
       return size;
   }
}