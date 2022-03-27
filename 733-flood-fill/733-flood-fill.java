class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        
        if(color==newColor) return image;
        
        image[sr][sc]=newColor; 
        if(sr<image.length-1 && image[sr+1][sc]==color) floodFill(image, sr+1, sc, newColor);
        if(sr>0 && image[sr-1][sc]==color ) floodFill(image, sr-1, sc, newColor);
        
        if(sc<image[0].length-1 && image[sr][sc+1]==color) floodFill(image, sr, sc+1, newColor);
        if(sc>0 && image[sr][sc-1]==color) floodFill(image, sr, sc-1, newColor);
        return image;
    }

}