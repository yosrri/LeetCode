class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertion= m+n-1;
        int i = m-1;
        int j = n-1;
        
        while(i>=0 && j>=0){
            if(nums2[j]>=nums1[i]){
                nums1[insertion--]=nums2[j--];  
            }
            else{
                nums1[insertion--]=nums1[i--];  
            }
        }
         // while(i>=0)
         //    nums1[insertion--]=nums1[i--];
        while(j>=0)
            nums1[insertion--]=nums2[j--];
        
    }
}