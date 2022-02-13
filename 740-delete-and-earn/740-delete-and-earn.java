class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] arr = new int[10001];
        for(int i: nums){
            arr[i]+=i;
        }
        
        int ans = 0;
        
        int max = 0;
        
        for(int i =2;i<arr.length;i++){
            arr[i]+=max;
            max=Math.max(max, arr[i-1]);
        }
        return Math.max(max, arr[arr.length-1]);
      
    }
}