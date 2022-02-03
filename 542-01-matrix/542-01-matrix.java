class Solution {
    public int[][] updateMatrix(int[][] mat) {
        for(int r=0;r<mat.length;r++){
            for(int c=0;c<mat[0].length;c++){
           
                
               if(mat[r][c]!=0){
                    mat[r][c] = mat.length+mat[0].length;
                   if(r==0 &&c>0) {
                       mat[r][c]= mat[r][c-1]+1;
                   }
                   
                   if(r>0){
                        mat[r][c]=mat[r-1][c]+1;
                        if(c>0){
                            mat[r][c]= Math.min(mat[r][c], mat[r][c-1]+1);
                        }   
                    }
               }
            }
        }
            
        for(int r = mat.length-1;r>-1;r--){
            for(int c = mat[0].length - 1;c>-1;c--){
           
                
                
                 if(mat[r][c]!=0){
                     
                     
                     if(r==mat.length-1 && c<mat[0].length-1){
                          mat[r][c]= Math.min(mat[r][c], mat[r][c+1]+1);
                     }
                     
                    if(r<mat.length-1){
                        mat[r][c]= Math.min(mat[r][c], mat[r+1][c]+1);
                    }   
                    if(c<mat[0].length-1){
                        mat[r][c]= Math.min(mat[r][c], mat[r][c+1]+1);
                    }   
               }

        }
        }
        return mat;
    }
}
   