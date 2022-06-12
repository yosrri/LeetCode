class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c)
            return mat;
        int [][] arr = new int[r][c];
        int col=0, row =0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = mat[row][col];
                col++;
                if(col==n){
                    col = 0;
                    row++;
                }
            }
        }
        return arr;
    }
}