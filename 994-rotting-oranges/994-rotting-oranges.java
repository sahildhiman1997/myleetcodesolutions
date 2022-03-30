class Solution {
    public int orangesRotting(int[][] grid) {
//         count total oranges, and note positions of rootne oranges
        int totalTomatoes = 0;
        int rottenTomatoes = 0;
        PriorityQueue<Integer[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    totalTomatoes++;
                    if(grid[i][j]==2){
                        queue.offer(new Integer[]{0,i,j});
                                                rottenTomatoes++;
                    }
                }
            }
        }
        if(totalTomatoes==0) return 0;
        if(rottenTomatoes==0) return -1;
        
   
        
        Integer[] current = new Integer[3];
        
        while(queue.isEmpty()==false){
            // System.out.println("rottenTomatoes:" +rottenTomatoes+  "totalTomatoes: "+totalTomatoes);
            current = queue.poll();
            
            int minute = current[0];
            int i = current[1];
            int j = current[2];
            
            
//             left
            if(i>0 && grid[i-1][j]==1) {
                queue.offer(new Integer[] {minute+1, i-1,j});
                grid[i-1][j]=2;  
                rottenTomatoes++;
            }
//             right
            if(i<grid.length-1 && grid[i+1][j]==1) {
                queue.offer(new Integer[] {minute+1, i+1,j});
             grid[i+1][j]=2;   
                rottenTomatoes++;
            }
            
//             up
            if(j>0 && grid[i][j-1]==1){
              queue.offer(new Integer[] {minute+1, i,j-1});
                grid[i][j-1]=2;
                rottenTomatoes++;
            } 
//             down
            if(j<grid[0].length-1 && grid[i][j+1]==1) {
                queue.offer(new Integer[] {minute+1, i,j+1});
                   grid[i][j+1]=2;
                rottenTomatoes++;
            }
        }
        // System.out.println("rottenTomatoes:" +rottenTomatoes+  "totalTomatoes: "+totalTomatoes);
        if(rottenTomatoes==totalTomatoes)  return current[0];
        return -1;
    }
}