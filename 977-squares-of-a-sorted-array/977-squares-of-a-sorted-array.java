class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
	int i = 0;
	int j = nums.length-1;
	int p = nums.length-1;
	while(p>-1){
		if(nums[i]*nums[i] > nums[j]*nums[j]){

			ans[p]=nums[i]*nums[i];
			i++;
		}else{
			ans[p]=nums[j]*nums[j];
			j--;
			
		}
		p--;
	}
	return ans;
    }
}