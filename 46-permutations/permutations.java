class Solution {
    public void permute(int ind, int nums[], List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> currAns=new ArrayList<>();
            for(int x: nums) currAns.add(x);
            ans.add(currAns);
            return ;
        }
        for(int j=ind; j<nums.length; j++){
            swap(nums, ind, j);
            permute(ind+1, nums, ans);
            swap(nums, ind, j);
        }
    }

    void swap(int []nums, int i, int j ){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        permute(0, nums, ans);
        return ans;
    }
}