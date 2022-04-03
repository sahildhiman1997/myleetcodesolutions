public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = n&1;
        for(int i = 0;i<31;i++){
            
            n= n>>>1;
            ans = ans<<1;
            ans|= n&1;
            
        }
       if(n<0){
           ans+=1;
       }
        return ans;
    }
}