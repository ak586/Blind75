class Solution {
    public void helper(int ind, int[]nums, List<Integer> ds, List<List<Integer>>ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind; i<nums.length; i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            helper(i+1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          Arrays.sort(nums);
          List<Integer> ds=new ArrayList<>();
          List<List<Integer>>ans=new ArrayList<>();
          helper(0, nums, ds, ans);
          return ans;
    }
}