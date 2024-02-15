class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        vector<int> preSum;
        int sum=0;
        unordered_map<int, int> mp;
        for(auto x: nums){
            sum+=x;
            int rem=sum%k;
            cout<<sum<<endl;
            if(rem<0) rem=k+rem;
            mp[rem]++;
        }
        int count=0;
        for(auto p: mp){
            cout<<p.first<<endl;
            if(p.second>1){
                int t=p.second;
                count+= (t*(t-1))/2;
            }
        }
        if(mp.find(0)!=mp.end() && mp[0]>=1) count+=mp[0]; 
        return count;
        
    }
};