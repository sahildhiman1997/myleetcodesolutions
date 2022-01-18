class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
//         what we normally need for binary search
        int lastcol = matrix[0].length-1;
        int lastrow = matrix.length-1;
        
        int startingrow = 0;
        int startingcol = 0;
        
       boolean rowfound = false;
        if (matrix[0][0]>target || matrix[lastrow][lastcol]<target){
            return false;
        }
        
        int midrow = (lastrow+startingrow)/2;
        while(!rowfound){
           
            if(matrix[midrow][0] <=target && 
               (midrow+1==matrix.length || matrix[midrow+1][0] >target) ){
                rowfound = true;
                break;
            }else  if(matrix[midrow][0] <target  ){
                startingrow = midrow+1;
            }else if(matrix[midrow][0] >target  ){
                lastrow = midrow-1;
            }
            midrow = (lastrow+startingrow)/2;
        }
        System.out.println("midrow is "+midrow);
    
        
        int midcol=(startingcol+lastcol)/2;
        while(startingcol<lastcol){
          System.out.println("midcol is "+midcol+"lastcol is "+lastcol+"startingcol was "+startingcol);
            if(matrix[midrow][midcol]==target){
                return true;
            }
            
            else if(matrix[midrow][midcol]>target && midcol>0){
                lastcol = midcol-1;
                midcol = (startingcol+midcol)/2;
            }else if(matrix[midrow][midcol]<target && midcol<matrix[0].length){
                
                 startingcol=midcol+1;
            
            
        }else{
                System.out.println("midcol was "+midcol+"lastcol was "+lastcol+"startingcol was "+startingcol);
                return false;
            } 
            midcol = (startingcol+lastcol)/2;
        
    }
        if(matrix[midrow][midcol]==target) return true;
         System.out.println("midcol was "+midcol+"lastcol was "+lastcol+"startingcol was "+startingcol);
        return false;
    }
}