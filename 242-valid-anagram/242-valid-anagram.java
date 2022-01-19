class Solution {
    public boolean isAnagram(String ransomNote , String  magazine) {
            
        if(ransomNote.length()!=magazine.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i), 1);
            }
        }
        
        for(char c : ransomNote.toCharArray()){
            
            System.out.println(map.get(c));
            
            if(map.containsKey(c) && map.get(c)>1){
                map.put(c, map.get(c)-1);
            }else if(map.containsKey(c) && map.get(c)==1){
                   map.remove(c);
                
            }else{
                return false;
            }
        }
        
        return true;
        
    }
        
    
}