class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int currMax=0;
        for(int i = 0 ; i<grid.length; i++){
            for(int j = 0 ; j<grid[0].length; j++){
                currMax=countMax(grid,i,j);
                if(currMax>max)
                    max = currMax;
            }
        }
        return max;
    }
    
    
    public int countMax(int[][] grid, int sr, int sc){
       int currMax = 0;
        if (sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] == 0) {
            return 0;
        }
        else {
            currMax++;
            grid[sr][sc] = 0;
            currMax += countMax(grid, sr + 1, sc);
            currMax += countMax(grid, sr, sc + 1);
            currMax += countMax(grid, sr - 1, sc);
            currMax += countMax(grid, sr, sc - 1);
            return currMax;
        }
    }
}