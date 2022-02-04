class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList();
        
        ans.add(s);
        for(int pos = 0;pos<s.length();pos++){
            
            if(Character.isAlphabetic(s.charAt(pos))){
                // System.out.println("char found " +s.charAt(pos));
                int size = ans.size();
                
                //for each string in the answer list, add the opposite case of the current alphabet 
                for(int i = 0;i<size;i++){
                    s = ans.get(i);
                    StringBuilder str = new StringBuilder("");
                        for(int c = 0;c<s.length();c++){
                            if(pos==c){
                                    if(Character.isUpperCase(s.charAt(pos))){
                                    str.append(Character.toLowerCase(s.charAt(c)));
                                }else{
                                    str.append(Character.toUpperCase(s.charAt(c)));
                                }
                                continue;
                            }
                            str.append(s.charAt(c));
                        }
                    ans.add(str.toString());
                            
                 }
            }
        }
        return ans;
    }
}