class Solution {
    public int search(int[] nums, int target) {
       int ans= binarysearch(nums,target);
       return ans;
    }

    int binarysearch(int [] arr, int target){

        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
