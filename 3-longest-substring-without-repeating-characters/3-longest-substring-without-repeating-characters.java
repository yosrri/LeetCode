class Solution {
    public int lengthOfLongestSubstring(String s) {
         if(s.length()==1)
            return 1;
        
        if(s.length()==0)
            return 0;
        
        HashMap<Character,Integer> hm = new HashMap<>();
        int longestSub=0;
        int currSub = 0;        
        for(int left= 0,right=0, n= s.length() ; right<n;){
            while(hm.containsKey(s.charAt(right) ) ){
                hm.remove(s.charAt(left));
                left++;
            }
            hm.put(s.charAt(right),0);
            right++;
            longestSub = Math.max(longestSub, right-left);
            
        }
        return longestSub;
    }
}