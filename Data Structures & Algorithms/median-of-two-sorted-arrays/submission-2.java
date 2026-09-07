class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     
     if(nums1.length>nums2.length){
        return findMedianSortedArrays(nums2,nums1);
     }

     int m=nums1.length;
     int n=nums2.length;

     int start=0;
     int end=m;

     while(start<=end){

        int part1=start+(end-start)/2;
        int leftsize=(m+n+1)/2;
        int part2=leftsize-part1;

        int l1=(part1==0)?Integer.MIN_VALUE:nums1[part1-1];
           int r1=(part1==m)?Integer.MAX_VALUE:nums1[part1];
              int l2=(part2==0)?Integer.MIN_VALUE:nums2[part2-1];
                 int r2=(part2==n)?Integer.MAX_VALUE:nums2[part2];
     
     if(l1<=r2 && l2<=r1){
        if((m+n)%2==0){

            double left=Math.max(l1,l2);
            double right=Math.min(r1,r2);
            return (left+right)/2;
        }else{
            return Math.max(l1,l2);
        }
     }else if(l1>r2){
        end=part1-1;
     }else{
        start=part1+1;
     }
     }
     return 0.0;
    }

}
