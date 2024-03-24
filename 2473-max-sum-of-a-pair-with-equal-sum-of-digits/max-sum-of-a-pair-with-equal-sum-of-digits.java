class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int ans=-1;
        for(int i=0; i<nums.length; i++){
            int digitSum=0;
            int num1=nums[i];
        while(num1!=0){
                digitSum+=num1%10;
                num1/=10;
        }
        num1=nums[i];
        if(map.containsKey(digitSum)){
            int num2=map.get(digitSum);
            ans=Math.max(ans, num1+num2);
            map.put(digitSum, Math.max(num1, num2));
            continue;
        }
        map.put(digitSum , nums[i]);
    }

    return ans;
}
}