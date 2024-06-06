class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, count2=0;
        int el1=1;
        int el2=2;
        for(int x: nums){
            if(count1==0 && x!=el2){
                count1++;
                el1=x;
            }
            else if(count2==0 && x!=el1){
                count2++;
                el2=x;
            }
            else if(x==el1 ) count1++;
            else if(x==el2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int x: nums){
            count1+= x==el1?1:0;
            count2+= x==el2?1:0;
        }
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        if(count1>n/3) ans.add(el1);
        if(count2>n/3) ans.add(el2);
        
        return ans;

    }
}