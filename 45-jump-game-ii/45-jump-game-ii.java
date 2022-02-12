class Solution {
    public int jump(int[] nums) {
     
        
        
        if(nums.length==1) return 0;
        
        int lastJump = 0;
        int jumps = 1;
        
        while(true){
            if(lastJump+nums[lastJump]>=nums.length-1) return jumps;
            
            
            int maxPossible = 0;   
            
            int temp = nums[lastJump];
            
            for(int i = 1;i<=nums[lastJump];i++){
                
                if(nums[lastJump+i]+i>=maxPossible){            
                    maxPossible= nums[lastJump+i]+i;
                    temp = i;
                }
            }
            System.out.println("jumped at "+lastJump);
            jumps++;
            lastJump+=temp;
        }
    }
}  