class Solution {
    public String simplifyPath(String path) {
        
        String[] pointers = path.split("/");
        
        Stack<String> stack =  new Stack<String>();
        
        for(String p: pointers){
            if(p.equalsIgnoreCase("..")){
                
                 if(stack.isEmpty()==false) stack.pop();
            } 
            
            else if(p!="" && p.equals(".")==false && p.equals("/")==false){
                stack.push(p);
            }
        } 
        
        StringBuilder ans = new StringBuilder("");
        
        while(!stack.isEmpty()){
            String k = stack.pop();
            ans.insert(0,"/"+k);
        }
        
        if(ans.toString()=="") return "/";
        
        return ans.toString();
    }
}