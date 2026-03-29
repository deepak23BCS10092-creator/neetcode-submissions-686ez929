class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] prefix = new int[N];
        prefix[0]=nums[0];
        int[] suffix = new int[N];
        suffix[N-1]=nums[N-1];
        for(int i=1;i<N;i++){
            prefix[i] = nums[i]*prefix[i-1];
        }
        for(int i =N-2;i>=0;i--){
            suffix[i]=nums[i]*suffix[i+1];
        }
        int[] ans = new int[N];
        for(int i =0;i<N;i++){
            int left = (i > 0) ? prefix[i-1] : 1;
            int right = (i < N - 1) ? suffix[i+1] : 1;
            ans[i] = left * right;
        }

        return ans;
    }
}