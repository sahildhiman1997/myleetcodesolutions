class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList();
        ans.add(s);
        
        for(int pos = 0;pos<s.length();pos++){
            char c = s.charAt(pos);
            if(Character.isAlphabetic(c)){
                if(Character.isUpperCase(c)){
                    c = Character.toLowerCase(c);
                }else{
                    c= Character.toUpperCase(c);
                }
                
                
                
                int ansSize = ans.size();
                for(int count = 0;count<ansSize;count++){
                    StringBuilder tempString = new StringBuilder("");
                    String original = ans.get(count);
                    
                    for(int i = 0;i<pos;i++){
                        tempString.append(original.charAt(i));
                    }
                    tempString.append(c);
                    for(int i = pos+1;i<s.length();i++){
                        tempString.append(original.charAt(i));
                    }
                    ans.add(tempString.toString());
                }
                    
                
               
            }
        }
        return ans;
        
        
        
    }
}