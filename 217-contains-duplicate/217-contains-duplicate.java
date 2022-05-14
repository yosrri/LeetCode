import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            if(!hm.containsKey(num)){
                hm.put(num,num);
            }
            else return true;
        }
        return false;
    }
}