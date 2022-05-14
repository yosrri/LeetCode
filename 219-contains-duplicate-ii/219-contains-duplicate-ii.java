class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0],0);
        for(int i = 1 ; i<nums.length ; i++){
            if(hm.containsKey(nums[i])){
                int noInBetween = i-hm.get(nums[i]);
                if(noInBetween<=k)
                    return true;
                else 
                    hm.put(nums[i],i);
            }
            else
                hm.put(nums[i],i);
        }
        return false;
    }
}