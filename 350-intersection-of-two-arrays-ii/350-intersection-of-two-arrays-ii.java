class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] directMappings = new int[1001];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1){
                directMappings[i]+=1;
            }
        
        int count = 0;
        Map<Integer, Integer> newmap = new HashMap<>();
        for(int i : nums2){
            if(directMappings[i]>0){
                directMappings[i]--;
                if(newmap.containsKey(i)){
                    newmap.put(i, newmap.get(i)+1);
                    
                }else{
                    newmap.put(i, 1);
                }
                count++;
            }
        }

        int[] ans = new int[count];
            for (Integer j: newmap.keySet()){
                for(int i = 0;i<newmap.get(j);i++){
                    count--;
                    ans[count]=(int) j;
                    
                }
            }
        return ans;
         }
}