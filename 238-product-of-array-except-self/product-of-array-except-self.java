class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixPro = 1;
        int n = nums.length;
        int rightPrefix[] = new int[n];
         rightPrefix[n-1]=1;
        for (int i = n - 2; i >= 0; i--) {
            rightPrefix[i] = rightPrefix[i+1]*nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            rightPrefix[i] *= prefixPro;
            prefixPro *= nums[i];
        }
        return rightPrefix;
        
    }
}