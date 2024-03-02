class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> ans;
        int n = nums.size();
        int i = 0;
        while (i < n) {
            if (nums[i] >= 0) 
                break;
            ++i;
        }

        int left =i - 1;
        int right = i;
        for (auto& x : nums)
            x = x * x;

        while (left >= 0 && right < n) {
            ans.push_back(min(nums[left], nums[right]));
            if (nums[left] <= nums[right])
                left--;
            else
                right++;
        }

        while (left >= 0)
            ans.push_back(nums[left--]);
        while (right < n)
            ans.push_back(nums[right++]);
        return ans;
    }
};