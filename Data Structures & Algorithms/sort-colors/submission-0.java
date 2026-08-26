class Solution {
    public void sortColors(int[] nums) {
        
        int [] num_freq=new int[3];
       
           
        for (int i = 0; i < nums.length; i++) {
             num_freq[nums[i]]++;
}
         
        // Iterating HashMap through for loop
        int index=0;
        for (int color=0;color<num_freq.length;color++){
           for(int count=0;count<num_freq[color];count++){
            nums[index++]=color;
           }

             

           
        }
        
    }
}