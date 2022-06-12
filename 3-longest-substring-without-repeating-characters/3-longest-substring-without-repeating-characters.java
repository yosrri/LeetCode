class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int longestSub=0;
        int currSub = 0;        
        for(int left= 0,right=0, n= s.length() ; right<n;){
            while(hm.containsKey(s.charAt(right) ) ){
                hm.remove(s.charAt(left));
                left++;
                currSub--;
            }
            hm.put(s.charAt(right),0);
            right++;
            currSub++;
            longestSub = Math.max(longestSub, currSub);
            
        }
        return longestSub;
    }
}