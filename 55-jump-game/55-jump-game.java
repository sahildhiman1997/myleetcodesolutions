class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        int[] possiblePos = new int[nums.length];
        
        
        possiblePos[0]=1;
        
        int i = 0;

        while(i<nums.length){
            if(possiblePos[i]==1){
                for(int j = 1;j<=nums[i];j++){
                    if((i+j)==nums.length-1) return true;
                    possiblePos[i+j]=1;

                }
                
            }
            i++;
        }
            
        System.out.println(Arrays.toString(possiblePos));
        if(possiblePos[nums.length-1]==1) return true;
        return false;
    }
}