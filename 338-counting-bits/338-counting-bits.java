class Solution {
    public int[] countBits(int n) {
        
        int[]  ans = new int[n+1];
        
        ans[0]=0;
        if(n>0) ans[1]=1;
    
        int count = 0;
        int lastPowerOfTwo = 1;
        
        for(int i =2;i<=n;i++){
            count++;
            if(count==lastPowerOfTwo){
                lastPowerOfTwo=i;
                ans[i]=1;
                count = 0;
            }else{
                ans[i]=1+ans[i-lastPowerOfTwo];
            }
        }
        return ans;
    }
}