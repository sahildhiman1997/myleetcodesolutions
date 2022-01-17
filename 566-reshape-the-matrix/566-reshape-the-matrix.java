class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][] newmatrix = new int[r][c];
        
        if(r*c==mat.length*mat[0].length){
            int m =0,n=0;
            for(int i = 0;i<r;i++){
                for(int j = 0;j<c;j++){
                newmatrix[i][j] = mat[m][n];
                    n++;
               
                    if(n==mat[0].length){
                        n=0;
                        m++;
                    }
                     
                }
            }
            return newmatrix;
        }
        return mat;
        
    }
}