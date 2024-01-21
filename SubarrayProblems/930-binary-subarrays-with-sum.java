class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        Map<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(map.containsKey(sum-goal))
            {
                ans+=map.get(sum-goal);
            }
            // if(map.containsKey(sum)) map.put(sum, map.get(sum)+1);
            // else map.put(sum, 1);
            map.merge(sum, 1, Integer::sum);
        }

        return ans;
    }
}


// optimised approach
/* !
 * !sliding window
 * tc:O(n) and sc:O(1)
 */

class Solution2 {
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