class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = nums[0];
        
        for(int num : nums){
            currSum= Math.max(num,num+currSum);
            max = Math.max(max, currSum);
        }
        return max;
    }
}