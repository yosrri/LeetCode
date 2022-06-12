import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums){
            if(hm.containsKey(num))
                return true;
            
            else hm.put(num,1);
        }
         return false;
    }   
}
   