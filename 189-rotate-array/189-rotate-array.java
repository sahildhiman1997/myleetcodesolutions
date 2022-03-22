class Solution {
    public void rotate(int[] nums, int k) { 
        k=k%nums.length;
        if(k==0) return;
        k=nums.length -k; 
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    
   void reverse(int[] nums, int start,int end){
        for(int i = start;i<=(start + (end - start)/2);i++){
            int temp = nums[i];
            nums[i]=nums[end - (i-start) ];
            nums[end - (i-start) ]=temp;
        }
    }
}