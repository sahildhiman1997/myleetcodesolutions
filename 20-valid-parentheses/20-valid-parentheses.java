class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        Map<Character, Character> mappings = new HashMap();
        
        mappings.put('{', '}');
        mappings.put('(', ')');
        mappings.put('[', ']');
        
        for(int i = 0;i<s.length();i++){
            if(mappings.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']'){
                
                if(stack.isEmpty()) return false;
                
                if(mappings.get(stack.peek())==s.charAt(i)){
                    stack.pop();
                }else{
                    return false;
                }
            }
            
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}