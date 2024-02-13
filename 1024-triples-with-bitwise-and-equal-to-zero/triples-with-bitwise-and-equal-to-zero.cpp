class Solution {
public:
    int countTriplets(vector<int>& nums) {
        unordered_map<int,int> mp;
        int n=nums.size();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mp[nums[i]&nums[j]]++;
            }
        }

        int count=0;
        for (auto k: nums){
            for(auto x: mp){
                if((x.first&k)==0) count+=x.second;
            }
        }
        return count;
    }
};