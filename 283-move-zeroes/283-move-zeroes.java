class Solution {
    public void moveZeroes(int[] nums) {
       int zeroPointer = 0;
        int nonZeroPointer = 0;      
        
        
        while(zeroPointer < nums.length && nums[zeroPointer]!=0 ){
                    zeroPointer++;
                }
        nonZeroPointer= zeroPointer;
        
        while(nonZeroPointer < nums.length){
            if(nums[nonZeroPointer]!=0){
                nums[zeroPointer] = nums[nonZeroPointer]; 
                nums[nonZeroPointer]=0;
                
                zeroPointer++;
            }else{
                while(zeroPointer < nums.length && nums[zeroPointer]!=0 ){
                    zeroPointer++;
                }
            }
            nonZeroPointer++;
        }
    }
}