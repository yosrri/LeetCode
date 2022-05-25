class Solution {
    public int numIslands(char[][] grid) {
        int noIslands=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0 ; j<grid[0].length;j++){
                noIslands+=count(grid,i,j);
            }
        }
        return noIslands;
    }
    
    public int count(char[][]grid,int sr,int sc){
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc]!='1')
            return 0;
        else{
            grid[sr][sc]= 0;  
            count(grid,sr+1,sc);
            count(grid,sr,sc+1);
            count(grid,sr-1,sc);
            count(grid,sr,sc-1);
            return 1;
        }
    }
}