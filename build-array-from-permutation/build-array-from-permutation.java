class Solution {
     static public int[] buildArrayWithExtraSpace(int[] nums) {
        int[] myarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            myarr[i] = nums[nums[i]];
        }
        return myarr;
    }
     
     
//      solution without using extra space.
      static public int[] buildArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            nums[i] += (nums[nums[i]]%nums.length)*nums.length;
        }
        for (int i = 0; i < nums.length; i++) {

            nums[i] /= nums.length;
        }


        return nums;
    }
     
}
