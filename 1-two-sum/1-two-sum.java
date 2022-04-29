class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        int[] arr = new int[2];
        int count = 0;
        for(int num: nums){
            if(hm.containsKey(target-num)){
                arr[0]= hm.get(target-num);
                arr[1] = count;
            }
            hm.put(num,count++);
        }
        return arr;
    }
}