class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      int[] arr = new int[2];
      int count = 0;
        for(int num: nums){
            int targetRem = target-num;
            if(hm.containsKey(targetRem)){
                arr[1]= count;
                arr[0] = hm.get(targetRem); 
            }
            else 
                hm.put(num,count);
            
            count++;
        }
        return arr;
    }
}


