class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
   if(n==0){
       return;
   }
        
        if(m==0) {
        for(int i =0;i<n;i++){
            nums1[i]=nums2[i];
        }
         return;
     }
        
        m--;
        n--;
        int i=m+n+1;
        
        while(m>-1 && n>-1){
            if(nums2[n]>nums1[m]){
                nums1[i]=nums2[n];
                // nums2[n]=0;
                n--;
                
            }else{
                nums1[i]=nums1[m];
                // nums1[m]=0;
               m--;
            }
            i--;
        }
        while(n>-1){
         nums1[n]=nums2[n]   ;
            n--;
        }
    }
}