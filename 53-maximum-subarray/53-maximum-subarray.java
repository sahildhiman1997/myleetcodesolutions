class Solution {
    public int maxSubArray(int[] arr) {
        
        int ans = arr[0];
        int currentPossibility = arr[0];
        
        for(int i = 1;i< arr.length;i++){
                currentPossibility = Math.max(currentPossibility+arr[i], arr[i]);
       
           ans=Math.max(currentPossibility, ans);
        }
        return ans;
    }
}
