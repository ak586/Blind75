class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        ans=n
        for i in range(n):
            ans=ans^i^nums[i]
        return ans
            
        