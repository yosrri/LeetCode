class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> hm = new HashMap<>();
        int[] index = new int[2];
        for(int i = 0; i<nums.length; i++){
            int otherPair = target-nums[i];
            if(hm.containsKey(otherPair)){
                index[0] = hm.get(otherPair);
                index[1] = i;
            }
               else hm.put(nums[i],i);
        }
        return index;
    }
}