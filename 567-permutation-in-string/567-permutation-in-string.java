class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        
        int[] repititions =  new int[26];
        for(int i = 0;i<s1.length();i++){
            repititions[s1.charAt(i)-97]++;
        }

        for(int i = 0;i<=s2.length()-s1.length();i++){
            
            for(int j = i;j<s1.length()+i;j++){
                if(repititions[s2.charAt(j)-97]==0){
                    // System.out.println("what the heck," +s2.charAt(j)+" at "+j);

                    //                     undo stuff
                    for(int k = i;k<j;k++){
                        repititions[s2.charAt(k)-97]++;
                    }
                    // System.out.println(s2.charAt(i)+" at i "+i);
                  break;
                }
                else{
                    repititions[s2.charAt(j)-97]--;
                    // System.out.println("found "+s2.charAt(j)+" at "+j);
                    if(j==s1.length()+i-1) return true;
                }
            }
        }
        return false;
    }
}