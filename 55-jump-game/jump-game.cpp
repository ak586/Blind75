class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        vector<int>v(n-1, false);
        v.push_back(true);
        
        int nextInd=n-1;
        for(int i=n-2; i>=0; i--){
            if(i+nums[i]>=nextInd){
                nextInd=i;
                v[i]=true;
            }    
        }
        if(nextInd==0) return true;
        return false;
        
    }
};