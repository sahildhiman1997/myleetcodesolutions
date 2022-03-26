class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        
        int ans = 0;
        
        Set<Character> set = new HashSet();
        for(int i =0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    while(s.charAt(start)!=s.charAt(i)){
                        set.remove(s.charAt(start));
                        start++;
                       
                    }
                    start++;
                }
                set.add(s.charAt(i));
                ans = Math.max(ans, set.size());
                
        }
        
        return ans;
    }
}