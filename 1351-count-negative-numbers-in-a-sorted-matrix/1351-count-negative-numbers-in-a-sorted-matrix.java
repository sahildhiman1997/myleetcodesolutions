class Solution {
//     public int countNegatives(int[][] grid) {
        
        
// //         how about iterting all of the array ?
//         int ans = 0;
//         for ( int r = 0;r<grid.length;r++){
//             for(int c = 0;c<grid[0].length;c++){
//                 if(grid[r][c]<0) ans++;
//             }
//         }
        
//         return ans;
   
        
//     }
    
     public int countNegatives(int[][] grid) {
        
        
//       how about finding the first zero / negative integer, and consider all integers below it and right to it as negative.
  
         int row = 0;
         int col = grid[0].length-1;
         int ans = 0;
         while(row<grid.length && col>=0){
         while(row<grid.length && grid[row][col]>=0){
             row++;
         }
         ans+=grid.length - row;
         col--;
         
         }
        
        
//          or 
        
        
        return ans;
        
        
        
    }
}