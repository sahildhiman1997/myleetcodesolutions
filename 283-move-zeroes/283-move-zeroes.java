class Solution {
    public void moveZeroes(int[] nums) {
        int p =  0;
        for(int i: nums){
            if(i!=0)   {
                nums[p]=i;
                p++;
            }
        }
        for(;p<nums.length;p++){
            nums[p]=0;
        }
        
    }
}