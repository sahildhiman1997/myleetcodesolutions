class Solution {
    public int lengthOfLongestSubstring(String s) {
 
                
        if(s==null || s.length()==0)return 0;
        
        int ans = 1;
        Set<Character> set = new HashSet<Character>();
        int start = 0, end = 0;
        
        while(end<s.length()){
           
            if(set.contains(s.charAt(end))){
               
                
                while (s.charAt(start)!=s.charAt(end)){
                    set.remove((Character) s.charAt(start));
                    start++;
                    
                }
                start++;
            }
           
             set.add(s.charAt(end));
             end++;
             ans = Math.max(ans, set.size());
        }
        
        return ans;
    }
}