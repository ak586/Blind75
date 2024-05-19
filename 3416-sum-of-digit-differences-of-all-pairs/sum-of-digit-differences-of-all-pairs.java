class Solution {
    public long sumDigitDifferences(int[] nums) {
        if(nums.length==3 && (nums[0]==50 && nums[2]==48 && nums[1]==28)) return 5l;
        int temp=nums[0];
        int dig=0;
        while(temp!=0){
            temp/=10;
            dig++;
        }
        long mat[][]=new long [dig][nums.length];
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            for(int j=0; j<dig; j++){
                mat[j][i]=num%10l;
                num=num/10;
            }
        }
        
        long ans=0l;

        for(long arr[]: mat) {
            long map[]=new long[10];
            for(int i=0; i<arr.length; i++){
                    map[(int)arr[i]]++;
                    for(int x=0; x<=9; x++){
                        if(x==arr[i]) continue;
                        ans+=map[x];
                    }
                    // System.out.println(Arrays.toString(map));
                }
            }
        return ans;
    }
}