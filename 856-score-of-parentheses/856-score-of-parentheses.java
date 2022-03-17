class Solution {
    public int scoreOfParentheses(String s) {
       int ans = 0;
       ans+=helper(s, 0, s.length());
       return ans;
    }
    
    int helper(String s, int start , int end){
        int count = 0;
        int ans = 0;
        for(int i = start;i<end;i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
                if(count ==0){
                    if(i-start == 1){
                        ans++;
                        
                    }else{
                    ans+=2*helper(s, start+1, i);
                        
                    }
                    start=i+1;
                }
            }
        }
        return ans;
    }
}