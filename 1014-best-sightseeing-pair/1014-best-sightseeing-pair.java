class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int start = values[0]+0;
        
        int end  = values[1]-1;
        int ans = start+end;        
        
        for (int i = 1;i<values.length;i++){
            if(end<=values[i]-i){
                end = values[i]-i;
                ans = Math.max(start+end, ans);
            }
            // System.out.println("start is "+start+", end is "+end+" at "+i);
         
            if(start<=values[i]+i ){
                start=values[i]+i;
                end = Integer.MIN_VALUE;
            }
            
        }
        return ans;
        
    }
}