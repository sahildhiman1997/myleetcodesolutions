/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low = 1;
        int high = n;
        int bad =  n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isBadVersion(mid)==true){
                if(mid==0 || isBadVersion(mid-1)==false){
                return mid;
                }
                high= mid-1;
                bad = mid;
                
            }else{
                low=mid+1;
            }

        }
        return bad;
        
    }
}