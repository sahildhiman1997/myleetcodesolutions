class Solution {
    public int climbStairs(int n) {
        if(n<4) return n;
 
        // Pure recursion, TLE error.
        // return climbStairs(n-1)+climbStairs(n-2);
        
        // Using additional space.
        // if(n<4) return n;
        // int[] ans = new int[n];
        // ans[1]=1;
        // ans[2]=2;
        // for(int i=3;i<n;i++){
        //     ans[i]=ans[i-1]+ans[i-2];
        // }
        // return ans[n-1]+ans[n-2];
        
        
//         can we reduce the space complexity more ?
        int a = 1;
        int b = 1;
        for(int i=3;i<=n;i++){
            int temp = a;
            a=b;
            b+=temp;
        }
        return a+b;
        
        
        
    }
}