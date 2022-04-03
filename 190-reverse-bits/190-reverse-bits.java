public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0;i<31;i++){
            ans+= n&1;
            n= n>>1;
            ans = ans<<1;
        }
       if(n<0){
           ans+=1;
       }
        return ans;
    }
}