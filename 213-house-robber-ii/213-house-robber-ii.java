class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(rob(nums, 0, nums.length-1), rob(nums, 1, nums.length));
    }
                        
    int rob(int[]nums, int start, int end){
        
        int[] temp = new int[end];
      
        temp[start]=nums[start];
              
        
        int max =0;
        
        for(int i = start+1;i<end;i++){
            temp[i]=max+nums[i];
            max=    Math.max(max, temp[i-1]);
        }
        
        return Math.max(max, temp[end-1]);
    }
}