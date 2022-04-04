class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int num:nums){
                hm.put(num,num);
        }
        for(int i = 1 ; i<=nums.length ; i++){
            if(!hm.containsKey(i)){
                ls.add(i);
                }
        }
        return ls;
    }
}