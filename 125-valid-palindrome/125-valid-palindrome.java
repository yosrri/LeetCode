class Solution {
    
    public String sanitizedString(String s){
         s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return s;
    }
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            
        }
        s = sanitizedString(s);
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}