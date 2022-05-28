class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int mark;
        for(int i=0;i<nums.length;i++){
           mark= Math.abs(nums[i]);
            if(nums[mark-1] < 0)
                ls.add(mark);
            else nums[mark-1]*=-1;
        }
        return ls;
    }
}