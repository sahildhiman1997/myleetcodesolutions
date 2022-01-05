class Solution {
     public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String s: sentences){
            int count  =0;
            for(char c : s.toCharArray()){
                if(c==' '){
                    count++;
                }
            }
            if(count>ans) ans=count;
        }
return ans+1;
    }
}