class Solution {
    private int countAtmostWithSum(int sum, int nums[]){
        int n=nums.length;
        int i=0;
        int j=0;
        int preSum=0;
        int count=0;
        while(j<n){
            preSum+=nums[j++];
            while(preSum>sum && i<j){
                preSum-=nums[i];
                i++;
            }
            count+=j-i;
        }
        return count;
    }

    public int numSubarraysWithSum(int []nums, int goal){
        // find atmost count(goal)
        // find atmost countSum(goal)
        int a=countAtmostWithSum(goal, nums);
        int b=countAtmostWithSum(goal-1, nums);
        return a-b;
    }
}