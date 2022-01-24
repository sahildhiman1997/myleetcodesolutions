class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length-1;
        int[] ans  = new int[nums.length];
        int p = nums.length-1;
        
        while(i<=j){
            if(nums[i]*nums[i] >= nums[j]*nums[j] ) {
                ans[p]= nums[i]*nums[i];
                i++;
            }else{
                ans[p]= nums[j]*nums[j];
                j--;
            }
            p--;
        }
         return ans;        
    }
}