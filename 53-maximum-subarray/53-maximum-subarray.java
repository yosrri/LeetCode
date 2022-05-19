class Solution {
    public int maxSubArray(int[] nums) {
     int max = nums[0];
        int currSum = 0;
        for (int num : nums) {
            currSum+=num;
           if(currSum>max)
               max = currSum;
           if(currSum<=0){
                currSum = 0;
           }
        }
        return max;
    }
}