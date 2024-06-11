class Solution {
    public boolean helper(int nums[], int ind, int sum, int [][]dp){
        if(ind==nums.length) return sum==0;
        boolean take=false;
        if(dp[ind][sum]!=-1) return dp[ind][sum]==1?true:false;

        if(sum>=nums[ind]) take=helper(nums, ind+1, sum-nums[ind], dp);
        boolean not_take=helper(nums, ind+1, sum, dp);
        boolean result=take|| not_take;
        dp[ind][sum]=result?1:0;
        return result;
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x: nums) sum+=x;
        int dp[][]=new int[nums.length+1][sum/2+1];
        for(int []temp: dp) Arrays.fill(temp, -1);
        return sum%2!=0?false:helper(nums, 0, sum/2, dp);
    }

}