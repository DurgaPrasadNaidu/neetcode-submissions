class Solution {
    public int trap(int[] height) {

       int leftMax=height[0] ;
       int rightMax=height[height.length-1];
       int left=1;
       int right=height.length-2;
       int trapWater=0;
        while(left<=right){
                    
           if(leftMax<=rightMax){

                 if(height[left]>leftMax){
                    leftMax=height[left];
                 }else{
                    trapWater+=leftMax-height[left];
                 }
                 left++;
           }else{
                 
                 if(height[right]>rightMax){
                    rightMax=height[right];
                 }else{
                    trapWater+=rightMax-height[right];
                 }
                  right--;

           }


            
        }
        return trapWater;
    }
}
