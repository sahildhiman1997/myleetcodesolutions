class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] charCount = new int[26];
        
        for(char c: s1.toCharArray()){
           charCount[c-'a']+=1;
        }
        
        
        int[] charCountCopy = new int[26];
        int i=0;
        for(int j = 0;j<s2.length();j++){
            i++;
            if(charCount[s2.charAt(j)-'a']>charCountCopy[s2.charAt(j)-'a']){
                charCountCopy[s2.charAt(j)-'a']++;
            }else{
                charCountCopy = new int[26];
                char temp = s2.charAt(j);
                j = j-i+1;
                i=0;
            }
            
            if(i==s1.length()){
                return true;
            }
        }

        return false;
    }
}