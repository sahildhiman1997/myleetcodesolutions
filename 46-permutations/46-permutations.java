class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList<Integer>());
        
        for(int i: nums){
            System.out.println(ans.toString());
            int ansSize = ans.size();
            for(int nthList= 0;nthList<ansSize;nthList++){
                List<Integer> l1 = ans.get(nthList);
                for(int blankSpace=0;blankSpace<l1.size();blankSpace++){
                    
                    // deep copy l into l2
                    List<Integer> l2 = new ArrayList();
                    for(int p = 0;p<l1.size();p++){
                        if(p==blankSpace) l2.add(i);
                        l2.add((int) l1.get(p));
                    }
                    
                    ans.add(l2);
                }
                l1.add(i);
                
            }
        }
        
        
        
        return ans;
      
        
    }
}