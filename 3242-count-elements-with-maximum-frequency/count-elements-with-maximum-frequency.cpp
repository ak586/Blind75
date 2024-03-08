class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int mp[101]={0};
        int mf=0;
        int ans=0;
        for(auto x:nums){
            mp[x]++;
            if(mp[x]==mf) ans+=mf;
            if(mp[x]>mf){
                mf=mp[x];
                ans=mf;
            }
        }

        return ans;
    }
};