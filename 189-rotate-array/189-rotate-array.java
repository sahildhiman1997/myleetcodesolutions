class Solution {
    public void rotate(int[] nums, int k) {
        k =k%nums.length;
        reverse(nums, 0, nums.length - k);
        reverse(nums, nums.length - k,nums.length);
        reverse (nums,0, nums.length);       
    }
    
    void reverse(int[] nums,int start,int end){
        int i = start;
        int j = end - 1;
        int temp;
        while(i<j){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
    }
}