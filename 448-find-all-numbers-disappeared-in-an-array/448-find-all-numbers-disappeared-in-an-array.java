class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<>();

        for (int num : nums) {
            num = Math.abs(num);
            nums[num - 1] = -Math.abs(nums[num - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ls.add(i + 1);
            }
        }
        return ls;
    }
}