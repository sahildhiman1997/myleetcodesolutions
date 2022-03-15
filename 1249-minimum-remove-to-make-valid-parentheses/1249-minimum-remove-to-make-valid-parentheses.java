class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> openBrackets=  new Stack();
        Stack<Integer> closedBrackets=  new Stack();
        StringBuilder ans = new StringBuilder("");
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openBrackets.push(i);
            }
            else if(s.charAt(i)==')'){
                if(openBrackets.isEmpty()) {
                    closedBrackets.push(i);
                }
                else{
                    openBrackets.pop();
                }
            }
            
        }
        
         for(int i = s.length()-1;i>-1;i--){
             if(!openBrackets.isEmpty() && i==openBrackets.peek()){
                    openBrackets.pop();                 
             }
             else if(!closedBrackets.isEmpty() && i==closedBrackets.peek()){
                 closedBrackets.pop();
             }else{
                 ans.insert(0, s.charAt(i));
             }
             
         
         }
        return ans.toString();
    }
        
}