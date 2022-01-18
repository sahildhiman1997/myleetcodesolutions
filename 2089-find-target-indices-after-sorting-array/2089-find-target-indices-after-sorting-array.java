class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        
        int low = 0;
        int high = nums.length-1;
        int mid = (low + high)/2;
        
        while(low<high){
            if(nums[mid]==target){
                break;
            }else if(nums[mid]>target){
                high= mid-1;
            }else{
                low= mid+1;
            }
            
             mid = (low + high)/2;
            
        }
        
        while(mid>=0 && nums[mid]==target){
            mid--;
        }
        
        
        List<Integer> ans = new ArrayList<>();
        while( mid<nums.length-1 && nums[mid+1]==target){
            ans.add(mid+1);
            mid++;
        }
        
        return ans;
        
        
    }
}