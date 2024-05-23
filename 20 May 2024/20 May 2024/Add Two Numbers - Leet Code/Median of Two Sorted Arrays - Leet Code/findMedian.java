class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if(m>n){
            findMedianSortedArrays(nums2, nums1);
        }

        float res = 0;
            
        int start = 0;
        int end = m;
        int pt1;

        while(start <= end){
            pt1 = (start+end)/2;
            int pt2 = (m+n+1)/2 -pt1;

            int maxLeftX;
            int minRightY;
            int maxLeftY;
            int minRightX;

            maxLeftX = (pt1 == 0) ?  Integer.MIN_VALUE : nums1[pt1 - 1];

            minRightY = (pt2 == n) ? Integer.MAX_VALUE : nums2[pt2];

            maxLeftY = (pt2 == 0) ? Integer.MIN_VALUE : nums2[pt2 - 1];

            minRightX = (pt1 == m) ? Integer.MAX_VALUE : nums1[pt1];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((m+n)%2 == 0){
                    res = (float)(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2 ;
                }
                else{
                    res = Math.max(maxLeftX, maxLeftY);
                }
                return res;
            }
            else if(maxLeftX > minRightY){
        
                end = pt1-1;
            }
            else{
                start = pt1+1;
        
            }
        }
        return res;
    }
}