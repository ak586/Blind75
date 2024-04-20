class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int curr_max=0;
        for(int i=0; i<nums.length; i++){
            curr_max=Math.max(nums[i], nums[i]+curr_max);
            max=Math.max(curr_max, max);
        }
        return max;
    }
}