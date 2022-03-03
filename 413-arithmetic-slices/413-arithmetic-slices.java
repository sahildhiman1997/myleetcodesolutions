class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
     
        int ans = 0;
        int currentCount = 0;
        int count = 0;
        for(int i = 2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                count++;
            }else{
                
//                 calculate how many APs in this..
                // then make count 0 again
                for(int t = 1;t<=count;t++){
                    ans+=t;
                    
                }
                count = 0;
            }
        }
         for(int t = 1;t<=count;t++){
                    ans+=t;
                    
                }
        return ans;
    }
}