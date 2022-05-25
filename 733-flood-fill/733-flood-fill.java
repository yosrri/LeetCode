class Solution {
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc]==newColor)
            return image;
        else{
        int oldColor = image[sr][sc]; 
        fill(image, sr,sc,newColor,oldColor);
        }
        return image;
    }
    
    
      public void fill(int[][] image, int sr, int sc, int newColor, int oldColor){
          
        // int[] directions = {0,-1,0,1};
          
        if(sr >= image.length || sc >= image[0].length || sr<0 || sc<0 || image[sr][sc]!=oldColor) 
            return;
          
        else {
            image[sr][sc] = newColor;
            fill(image, sr,sc-1,newColor,oldColor);
            fill(image, sr,sc+1,newColor,oldColor);
            fill(image, sr-1,sc,newColor,oldColor);
            fill(image, sr+1,sc,newColor,oldColor);
        }
    }
}