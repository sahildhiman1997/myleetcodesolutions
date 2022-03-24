class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        char temp = 'a';
        for(int i = 0;i<l/2;i++){
             temp = s[i];
            s[i]=s[l-1-i];
            s[l-1-i]=temp;
        }
    }
}