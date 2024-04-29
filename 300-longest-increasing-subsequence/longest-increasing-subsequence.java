class Solution {

    public int helper(int ind, int prev, int nums[], int dp[][]){
        if(ind==nums.length) return 0;
        int take=0, not_take=0;
        
        if(prev==-1) 
            take= 1+ helper(ind+1, ind, nums, dp);
        if(prev!=-1 && dp[ind][prev]!=-1) return dp[ind][prev];
        else if(prev!=-1 && nums[ind]>nums[prev])
                take= 1+helper(ind+1, ind, nums, dp);
        not_take=helper(ind+1, prev, nums, dp);
        if(prev!=-1)
        dp[ind][prev]=Math.max(take, not_take);
        return Math.max(take, not_take);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int [nums.length][nums.length];
        for(int a[]: dp) Arrays.fill(a, -1);
        return helper(0,-1, nums, dp);
    }
}