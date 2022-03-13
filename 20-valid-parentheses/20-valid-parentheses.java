class Solution {
    public boolean isValid(String s) {
        
        if(s.length()%2!=0) return false;
        Map<Character, Character> mapping = new HashMap();
        mapping.put('(',')');
        mapping.put('{','}');
        mapping.put('[', ']');

        Stack<Character> stack = new Stack();
        
        for(int i = 0;i<s.length();i++){
            if(mapping.containsKey(s.charAt(i))){
                stack.push(mapping.get(s.charAt(i)));
            }else{
                if(stack.isEmpty()==true || stack.pop()!=s.charAt(i)){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
        
    }
}