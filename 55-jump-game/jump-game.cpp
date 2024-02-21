class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();


        int nextInd=n-1;
        for(int i=n-2; i>=0; i--){
            if(i+nums[i]>=nextInd){
                nextInd=i;
            }    
        }
        if(nextInd==0) return true;
        return false;
    }
};