class Solution {
    public int[][] updateMatrix(int[][] mat) {
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    int left = i>0?mat[i-1][j]+1:100000;
                    int up = j>0?mat[i][j-1]+1:100000;
                    mat[i][j]= Math.min(left, up);
                }
            }
        }
        
        for(int i =mat.length-1;i>=0;i--){
            for(int j = mat[0].length-1;j>=0;j--){
                if(mat[i][j]!=0){
                    int right = i<mat.length-1?mat[i+1][j]+1:100000;
                    int down = j<mat[0].length-1?mat[i][j+1]+1:100000;
                    mat[i][j]= Math.min(mat[i][j], Math.min(right, down));
                }
            }
        }
        return mat;
    }
}