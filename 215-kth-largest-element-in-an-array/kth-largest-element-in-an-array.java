class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minH=new PriorityQueue<>();
        for(int i=0; i<k; i++) minH.offer(nums[i]);

        int i=k;
        int n=nums.length;
        while(i<n){
            if(minH.peek()<nums[i]){
                minH.poll();
                minH.offer(nums[i]);
            }
            i++;
        }
        return minH.poll();

    }
}