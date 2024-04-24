class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashMap<Integer, Boolean> map=new HashMap<>();
        for(int a:nums){
            map.put(a, true);
        }
        HashMap<Integer, Boolean> visited=new HashMap<>();
        for(int num: nums){
            if(visited.containsKey(num) || map.containsKey(num-1)) continue;
            int curr_len=0;
            while(true){
                if(!map.containsKey(num)) break;
                visited.put(num, true);
                num++;
                curr_len++;
                ans=Math.max(ans, curr_len);
            }
        }
        return ans;
    }
}