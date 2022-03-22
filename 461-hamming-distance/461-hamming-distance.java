class Solution {
    public int hammingDistance(int x, int y){
	int ans = 0;
	int a = x^y;
	while(a!=0){

		ans+= a & 1;
		a= a>>1;
}


	return ans;

}
}