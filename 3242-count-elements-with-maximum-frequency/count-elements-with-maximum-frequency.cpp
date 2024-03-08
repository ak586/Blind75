class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int map[101]={0};
        int mf=0;
        int ans=0;
        for(auto x: nums){
            map[x]++;
            mf=max(map[x], mf);
        }
        for(auto x: map){
           if(x==mf) ans+=mf;
        }

        return ans;
    }
};