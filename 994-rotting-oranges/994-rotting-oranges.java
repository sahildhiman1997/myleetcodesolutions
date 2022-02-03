
class Solution {
    static class Position{
    int x;
    int y;
    Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
    
    public int orangesRotting(int[][] grid) {
        Queue<Position> rotten = new ArrayDeque<Position>();
        int total = 0;
        int ans = -1;
        int totalrottenCount=0;
        
//         Let's gather all the tomatoes first ( oranges don't rotten that fast)
        for(int r= 0;r<grid.length;r++){
            for(int c = 0;c<grid[0].length;c++){
                if(grid[r][c]==2){
                    rotten.add(new Position(r,c));
                    totalrottenCount++;
                }
                if(grid[r][c]!=0) total++;
                 
            }
        }
        
        if(totalrottenCount==total) return 0;
       
//         for clarity
        System.out.println(totalrottenCount +" are rotten initially out of "+total);
         // totalrottenCount = 0;
        while(!rotten.isEmpty()){
            System.out.println("total rotten: "+rotten.size());
            int countThisMinute = rotten.size();
            while(countThisMinute>0){
                Position p = rotten.poll();
                
                if(grid[p.x][p.y]==1){
                    grid[p.x][p.y]=2;
                    totalrottenCount++;
                }
                
                if(p.x<grid.length-1 && grid[p.x +1][p.y]==1){
                    rotten.add(new Position(p.x+1, p.y));
                }
                if(p.x>0 && grid[p.x-1][p.y]==1){
                    rotten.add(new Position(p.x-1, p.y));
                }
                
                if(p.y<grid[0].length-1 && grid[p.x][p.y+1]==1){
                    rotten.add(new Position(p.x, p.y+1));
                }
                if(p.y>0 && grid[p.x][p.y-1]==1){
                    rotten.add(new Position(p.x, p.y-1));
                }
                
                countThisMinute--;
            }
          
            ans++;
            if(total == totalrottenCount) return ans;
            
            System.out.println(totalrottenCount +" are rotten  out of "+total+"at stage"+ans);
        }
        System.out.println("finally, "+totalrottenCount +" are rotten finaly out of "+total);
        if(total != totalrottenCount) return -1;
        
        return ans;
    }
}