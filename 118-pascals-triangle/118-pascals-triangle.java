class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>(); 
        for(int i = 0 ; i< numRows; i++){
             List<Integer> triRow = new ArrayList<>();
            for(int j = 0 ; j<=i ; j++){
                if(j==0 || j==i){
                    triRow.add(1);
                }
                else {
                    int sum = triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                    triRow.add(sum);
                }
            }
            triangle.add(triRow);
        }
        return triangle;
    }
}