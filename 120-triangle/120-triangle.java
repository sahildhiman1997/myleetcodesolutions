class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
            for(int row = triangle.size()-2;row>-1;row--){
                
                List<Integer> currentList = triangle.get(row);
                List<Integer> belowList = triangle.get(row+1);
                
                for(int col = 0;col<currentList.size();col++){
                    
                    currentList.set(col, Math.min(belowList.get(col),belowList.get(col+1))+currentList.get(col));
                }
            }
        return triangle.get(0).get(0);
    }
}