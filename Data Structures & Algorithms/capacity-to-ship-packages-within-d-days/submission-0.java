class Solution {

    public int shipWithinDays(int[] weights, int D) {
        int start=0;
        int end=0;
        for(int weight:weights){
           start=Math.max(start,weight);
           end+=weight;
        }

        while(start<=end){
             
             int mid=start+(end-start)/2;
             int days=1;
             int sum=0;
             for(int weigth:weights){

                if(sum+weigth>mid){
                    days++;
                    sum=0;
                }
                sum+=weigth;
             }

             if(days<=D){
                end=mid-1;
             }else{
                start=mid+1;
             }


        }
     return start;
    }
}