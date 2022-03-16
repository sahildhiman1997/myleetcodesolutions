class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = 1;
        int majority =0;
        for(int n: nums){
            if(n==majority){
                majorityCount++;
            }else{
                majorityCount--;
                if(majorityCount ==0){
                    majority=n;
                    majorityCount++;
                }
                                      
            }
        }
        return majority;
    }
}