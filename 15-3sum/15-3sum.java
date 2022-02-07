class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
    
        List<List<Integer>> ans = new ArrayList();
        
        if(nums.length<3) return ans;
        
        for(int i = 0;i<nums.length;i++){
         
            
            int s = i+1;
            int e  = nums.length - 1;
            
            while(s<e){
                List<Integer> current = new ArrayList();
                int sum = nums[i]+nums[s]+nums[e];
                if(sum==0){
                    current.add(nums[i]);
                    current.add(nums[s]);
                    current.add(nums[e]);
                    ans.add(current);
                    
                  while(s<nums.length - 1 && nums[s]==nums[s+1]){
                      s++;
                  }
                    s++;
                    
                    while(e<nums.length - 1 && nums[e]==nums[e+1]){
                      e++;
                  }
                    e--;
                    
                continue;
                }
        
                else if(sum>0){
                    e--;
                    
                }else{
                    s++;
                }
                
                
            }
            
             while(i<nums.length - 1 && nums[i]==nums[i+1]){
              i++;
          }
         
        }
        return ans;
    }
}