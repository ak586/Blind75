class Solution {
public:
    int hammingDistance(int x, int y){
        int z=x^y;
        int count=0;
        while(z!=0){
            count+=(z&1);
            z>>=1;
        }
        return count;
    }
    int totalHammingDistance(vector<int>& nums) {
        int ans=0;
        int n=nums.size();
        for(int i=0; i<31; i++){
            int oneCount=0;
            for (int j=0; j<n; j++){
                int temp=nums[j]&1;
                oneCount+=temp;
                nums[j]=nums[j]>>1;
            }
            int zCount=n-oneCount;
            ans+=zCount*oneCount;
        }
        return ans;
    }
};