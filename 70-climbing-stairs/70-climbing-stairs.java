class Solution {
    public int climbStairs(int n) {
        
        // Pure recursion, TLE error.
        // if(n<4) return n;
        // return climbStairs(n-1)+climbStairs(n-2);
        
        // Using additional space.
        if(n<4) return n;
        int[] ans = new int[n];
        ans[1]=1;
        ans[2]=2;
        for(int i=3;i<n;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n-1]+ans[n-2];
    }
}