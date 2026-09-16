class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int left=0;
        int right=arr.length-1;
         List<Integer> result= new ArrayList<>();
        while(left<right){
          
          int mid=left+(right-left)/2;

          if(mid+k < arr.length && Math.abs(arr[mid]-x) >Math.abs(arr[mid+k]-x)){
         left=mid+1;
          }else{
            right=mid;
          }

        }
      
      for(int i=left;i<left+k;i++){
        result.add(arr[i]);
      }
      return result;
    }
}