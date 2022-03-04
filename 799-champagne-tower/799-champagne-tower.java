class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
       int rows = 0;
        
        List<Double> currentRow  = new ArrayList<Double>();
        currentRow.add((double ) poured);
        while(rows < query_row){
            currentRow.add( 0.0 );
            for(int i = currentRow.size()-2;i>-1;i-- ){
                currentRow.set(i+1, Math.max(0,(currentRow.get(i)-1)/2) + currentRow.get(i+1) );
                currentRow.set(i, Math.max(0,(currentRow.get(i)-1)/2) ); 
            }
            rows++;
        }
        
        return Math.max(0, Math.min(1, currentRow.get(query_glass)));
    }
}