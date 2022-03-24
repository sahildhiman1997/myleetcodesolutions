class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                for(int j = i-1;j>=start;j--){
                    ans.append(s.charAt(j));
                }
                ans.append(' ');
                start=i+1;
            }
        }
        
        for(int j = s.length()-1;j>=start;j--){
                    ans.append(s.charAt(j));
        }
        return ans.toString();
    }
}