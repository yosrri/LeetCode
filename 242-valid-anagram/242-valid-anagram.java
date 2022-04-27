class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int [] freq = new int[26];
        for(int i = 0;i<s.length(); i++){
            //a ascii code is 97 so if char is b then 97-96 = 1 index of b
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int f: freq){
            if(f!=0)
                return false;}
        return true;}
    }
