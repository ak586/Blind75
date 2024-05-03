class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int ans=Integer.MIN_VALUE;
        for(int a: nums){
            ans=Math.max(ans,a-min );
            min=Math.min(a,min);
        }
        return ans>0?ans:-1;
    }
}