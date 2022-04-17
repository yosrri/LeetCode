class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        if(letters[0]>target || letters[len-1]<=target)
            return letters[0];
       
        int start = 0;
        int end = len;
        int mid = 0;
        
        while(start <= end){
            mid = start+(end-start)/2;
            System.out.println(mid);
             if (target< letters[mid])
                end = mid-1;
            else if(target>= letters[mid])
                start = mid+1;
        }
        return letters[start];
 }
        
        
}