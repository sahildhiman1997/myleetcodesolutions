class Solution {
    public int maxProduct(int[] nums) {
        
        int largest = nums[0]-1;
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            ans = Math.max(ans, largest * (nums[i]-1));
            if(nums[i]-1 > largest) largest = nums[i]-1;
        }
        return ans;
    }
}