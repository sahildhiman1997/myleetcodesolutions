class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<board.length;i++){
            Set<Character> row = new HashSet<Character>();
            for(int j = 0;j<board[0].length;j++){
                if(row.contains(board[i][j]) && board[i][j]!='.'){
                          System.out.println("couldnt compete at row"+i+" "+j);
                    return false;
                }
                row.add(board[i][j]);
                
            }
        }
        
        for(int i = 0;i<board.length;i++){
            Set<Character> col = new HashSet<Character>();
            for(int j = 0;j<board[0].length;j++){
                if(col.contains(board[j][i]) && board[j][i]!='.' ){
                    System.out.println("couldnt compete at column"+i+" "+j);
                    return false;
                }
                col.add(board[j][i]);
            }
        }
        
        int[] centerOnes = new int[]{1,4,7};
        
        for(int i: centerOnes){
            for(int j: centerOnes){
                Set<Character> smallerSquare = new HashSet<Character>();
                
                for(int r = i-1;r<=i+1;r++){
                    for(int c = j-1;c<=j+1;c++){
                        if(smallerSquare.contains(board[r][c]) && board[r][c]!='.'){
                            System.out.println("couldnt compete at smaller square"+r+","+c);
                            return false;
                        }
                        smallerSquare.add(board[r][c]);
                    }
                }
                
                
                
            }
        }
        
        
        
        return true;
    }
}