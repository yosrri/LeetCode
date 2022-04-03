import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // boolean duplicate = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num: nums){
            if(hm.containsKey(num)){
                return true; 
            }
            else 
                hm.put(num,num);
        }
        return false;
    }
}