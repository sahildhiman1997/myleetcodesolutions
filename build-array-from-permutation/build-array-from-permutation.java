class Solution {
     static public int[] buildArray(int[] nums) {
        int[] myarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            myarr[i] = nums[nums[i]];
        }
        return myarr;
    }
}