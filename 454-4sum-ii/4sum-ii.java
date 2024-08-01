class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> mp = new HashMap<>();
   
        for (int a : nums1) {
            for (int b : nums2)
                mp.merge(a + b, 1, Integer::sum);
        }

        int count = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                count += mp.getOrDefault(-(c + d), 0);
            }
        }
        return count;

    }
}