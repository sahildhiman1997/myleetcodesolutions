class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> ans = new ArrayList();
        if(nums.length==0) return ans;
        
        ans.add(new ArrayList(){{add(nums[0]);}});
        
                
//      for each number that we have been provided
        for(int i=1;i<nums.length;i++){
            
//          get the current size of the answer
            int size = ans.size();
            
//          for each list in the answer as of now, add the current number at each position
            for(int j = 0;j<size;j++){
                List<Integer> l = ans.get(j);
                
                
//              copy the list into temporary list and then append the list to the answer,
                // not once but the current size of each list, that is 'i'
                
                int pos = 0;
                while(pos<l.size()){
                    List<Integer> temp = new ArrayList();
                    for(int e = 0;e<l.size();e++){
                        if(pos==e){
                            temp.add(nums[i]);
                        }

                        temp.add(l.get(e));
                    }
                   
                    ans.add(temp);
                    pos++;
                }
                 l.add(nums[i]);
                
            }
        }
        return ans;
        
    }
}