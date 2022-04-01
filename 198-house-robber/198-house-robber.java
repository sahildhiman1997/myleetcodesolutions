class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        
        int withCurrentLoot= nums[0];
        int withoutCurrentLoot = 0;
        
        for(int i =1;i<nums.length;i++){
            int lastLoot = withCurrentLoot;
            
            withCurrentLoot =withoutCurrentLoot+nums[i];
            withoutCurrentLoot = Math.max(lastLoot, withoutCurrentLoot);
            
        }
        return Math.max(withoutCurrentLoot, withCurrentLoot)        ;
        
    }
}