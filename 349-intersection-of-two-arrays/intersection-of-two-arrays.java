class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st=new HashSet<Integer>();
        for(int x: nums1) st.add(x);
        int i=0;
        for(int x: nums2){
            if(st.contains(x)){
                nums2[i++]=x;
                st.remove(x);
            }
        }
        int ans[]=new int[i];
        while(i>0){
            ans[i-1]=nums2[i-1];
            i--;
        }
        return ans;
    }
}