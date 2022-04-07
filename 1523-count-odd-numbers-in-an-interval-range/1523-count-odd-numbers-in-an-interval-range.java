class Solution {
    public int countOdds(int low, int high) {
    // System.out.println(979430543-800445804);
        int ans =(int) Math.ceil(( (double)(high - low))/2);
        if(low%2==1 && high%2==1){
            return ans+1;
        }
        return ans;
        // int ans =0;
        // while(low<=high){
        //     if(low%2==1) ans+=1;
        //     low+=1;
        // }
        // return ans;
    }
}