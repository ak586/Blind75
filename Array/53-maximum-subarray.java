class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int current_max=nums[0];
        int max=nums[0];
        for (int i=1; i<n; i++){
            current_max=Math.max(nums[i],current_max+nums[i]);
            max=Math.max(current_max, max);
            // System.out.println(max);
        }
        return max;
    }
}