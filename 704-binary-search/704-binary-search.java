class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 0) return -1;
        
        int low  = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            int e = nums[mid];
            if(e==target) return mid;
            else if(e<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return -1;
    }
}