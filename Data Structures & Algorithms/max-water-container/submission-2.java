class Solution {
    public int maxArea(int[] heights) {
        
        int start=0;
        int end=heights.length-1;
        int maxarea=0;

        while(start<end){

           int width=end-start;
        int minheight=Math.min(heights[start],heights[end]);
         maxarea=Math.max(maxarea,width*minheight);
         if (heights[start] < heights[end]) {
    start++;
} else {
    end--;
}
        }

        return maxarea;
    }
}
