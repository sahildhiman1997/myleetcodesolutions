/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int current = 0;
        while(start!=end){
            current = start + (end-start)/2;
            System.out.println(current);
            if(isBadVersion(current)){
                end = current;
            }else{
                start = current+1;
            }
        }
        return (start+(end-start)/2);
            
    }
}