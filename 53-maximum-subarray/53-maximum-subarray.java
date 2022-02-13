class Solution {
    public int maxSubArray(int[] arr) {
        int ans = arr[0];
        int sum = 0;
        for(int i: arr){
            sum+=i;
            if(sum>ans) ans = sum;
            if(sum<=0) sum=0;
        }
        return ans;
    }
}
