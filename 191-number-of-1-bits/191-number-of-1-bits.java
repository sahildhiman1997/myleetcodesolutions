public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // n= n<<1;
        int ans = 0;
        while(n!=0){
            ans+= n&1;
           n= n>>>1;
        }
        return ans;
    }
}