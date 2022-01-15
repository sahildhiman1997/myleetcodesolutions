class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        
        for(int i =0;i<nums.length;i++){
            if(values.containsKey(target-nums[i])){
                return new int[]{values.get(target-nums[i]), i};
            }else{
                values.put(nums[i],i);
            }
        }
        return null;
    }
}