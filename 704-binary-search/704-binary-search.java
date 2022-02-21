class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high=nums.length;
        
        int current = (low+high)/2;
        while(high>low){
                 current = (low+high)/2;
            if(target==nums[current]) return current;
            else if(target<nums[current]){
                high = current;
            }else{
                low = current+1;
            }
        }
        return -1;
        
        
    }
}