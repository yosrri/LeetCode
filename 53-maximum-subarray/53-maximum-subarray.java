class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int maxSum = nums[0];
        
        for(int i= 1; i<nums.length;i++){
            if(currSum<0){
                currSum=0;
            }
            currSum+=nums[i];
            maxSum = Math.max(maxSum,currSum);
        }
     return maxSum;   
    }
}