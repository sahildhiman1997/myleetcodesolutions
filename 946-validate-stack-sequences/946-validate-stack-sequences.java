class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack()   ;
        int pop = 0;
        int push = 0;
        while(pop<popped.length){
            if(!stack.isEmpty() && stack.peek()==popped[pop]){
                pop++;
                stack.pop();
            }else {
                if(push<pushed.length){
                    stack.push(pushed[push]);
                    push++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}