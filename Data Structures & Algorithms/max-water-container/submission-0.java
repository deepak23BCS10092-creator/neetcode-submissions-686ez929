class Solution {
    public int maxArea(int[] heights) {
        int fnl=0;
     for(int i =0;i<heights.length;i++){
        for(int j =i+1;j<heights.length;j++){
            int res = Math.min(heights[i],heights[j])*(j-i);
            fnl = Math.max(fnl,res);
        }
     }   
     return fnl;
    }
}
