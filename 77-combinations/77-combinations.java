class Solution {
    public List<List<Integer>> combine(int n, int k) {
     
        List<List<Integer>> ans = new ArrayList();
        
        List<List<Integer>> allCombinations = new ArrayList();
        allCombinations.add(new ArrayList<Integer>());
        
        for(int i = 1;i<=n;i++){
            add(ans, i,k, allCombinations);
            System.out.println(ans.toString());
        }
        return ans;
    }
    
   void add(List<List<Integer>> ans, int i, int k , List<List<Integer>> allCombinations){
      int n = allCombinations.size();
       for(int j=0;j<n;j++){
            List<Integer> l = allCombinations.get(j);
            List<Integer> l2 = new ArrayList();
            for(int e: l){
                l2.add(e);
               
            } l2.add(i);
            
            if(l2.size()==k){
                ans.add(l2);
            }else{
                allCombinations.add(l2);
            }
        }
    }
    
}