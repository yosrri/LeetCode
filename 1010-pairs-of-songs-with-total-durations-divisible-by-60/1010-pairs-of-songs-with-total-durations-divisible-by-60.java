class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        int index = 0;
        for(int dur : time){
            int rem = dur%60;
            if(rem==0){
                 if(hm.containsKey(0))
                    count+=hm.get(0);
            }
            else if(hm.containsKey(60-rem)){
                count+=hm.get(60-rem);
                
            }
            if(hm.containsKey(rem)){
                hm.put(rem,hm.get(rem)+1);
            }
            else {
                hm.put(rem,1);
            }
        }
        return count;
    }
}
    