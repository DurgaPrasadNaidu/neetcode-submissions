/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
         
         int peak= findPeak(arr);

         int ans=orderAgnosticBinarySearch(arr,0,peak,target);
         if(ans!=-1){
            return ans;
         }

        return orderAgnosticBinarySearch(arr,peak+1,arr.length()-1,target);
    }

    int findPeak(MountainArray arr){
         
         int start=0;
         int end=arr.length()-1;

         while(start<end){
            int mid=start+(end-start)/2;

            if(arr.get(mid)>arr.get(mid+1)){
                end=mid;
            }else{
                start=mid+1;
            }
         }
        return start;
    }

    int orderAgnosticBinarySearch(MountainArray arr, int start,int end,int target){

        boolean isAsc=arr.get(start)<arr.get(end);

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr.get(mid)==target){
                return mid;
            }
            if(isAsc){
              if(arr.get(mid)>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

            }else{

                 if(arr.get(mid)>target){
                     start=mid+1;
                
            }else{
               end=mid-1;
            }

            }
        }
        return -1;
    }
}