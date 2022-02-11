class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1) return nums[0];
        
        int max = nums[0];

        for(int i = 2;i<nums.length;i++){
            nums[i]+=max;
            max = Math.max(max, nums[i-1]);
        }
        
        return Math.max(max, nums[nums.length-1]);
        
    }
}