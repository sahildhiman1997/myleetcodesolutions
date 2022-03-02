class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_iterator = 0;
        int t_iterator = 0;
        
        while(s_iterator<s.length() && t_iterator<t.length()){
            if(s.charAt(s_iterator) == t.charAt(t_iterator)){
                s_iterator++;
            }
            t_iterator++;
        }
        
        if(s_iterator == s.length()) return true;
        return false;        
    }
}