class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        int ans=1;
        if(nums.length==0){return 0;}
        int curr=nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=curr){
                if(nums[i]-curr ==1){
                    cnt++;
                    ans=Math.max(ans,cnt);
                }else{
                    ans=Math.max(ans,cnt);
                    cnt=1;
                }
            }
            curr=nums[i];
        }
        return ans;
    }
}
