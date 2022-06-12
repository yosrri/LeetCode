class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(nums1.length<=nums2.length){
            for(int num : nums1){
                if(hm.containsKey(num)){
                   int freq = hm.get(num)+1;
                    hm.put(num,freq);
                }
                else {
                    hm.put(num,1);
                }
            }
            for(int num: nums2){
                if(hm.containsKey(num) && hm.get(num)>0){
                    arr.add(num);
                    hm.put(num,hm.get(num)-1);
                }
            }
            int[] result = new int[arr.size()];
            int i = 0;
            for(int num: arr)
                result[i++]=num;
            return result;
        }
        else {
            for(int num : nums2){
                if(hm.containsKey(num)){
                   int freq = hm.get(num)+1;
                    hm.put(num,freq);
                }
                else {
                    hm.put(num,1);
                }
            }
            for(int num: nums1){
                if(hm.containsKey(num) && hm.get(num)>0){
                    arr.add(num);
                    hm.put(num,hm.get(num)-1);
                }
            }
            
            int[] result = new int[arr.size()];
            int i = 0;
            for(int num: arr)
                result[i++]=num;
            return result;
        }
    }
}