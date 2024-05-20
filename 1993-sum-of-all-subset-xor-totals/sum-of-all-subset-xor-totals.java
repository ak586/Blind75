class Solution {
    public int helper(int nums[], int ind, int curr){
        if(ind==nums.length) return curr;
        return helper(nums, ind+1, curr^nums[ind])+helper(nums, ind+1, curr);

    }
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
}