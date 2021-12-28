class Solution {
  public int minPartitions(String n) {

        int ans =1;
        for(char c : n.toCharArray()){

            if(Integer.parseInt(String.valueOf(c)) >ans){
                ans = Integer.parseInt(String.valueOf(c));
                if(ans == 9){
                    return 9;
                }
            }
        }
        
            return  ans;
            
        
    }
}