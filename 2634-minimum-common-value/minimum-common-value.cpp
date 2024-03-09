class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        set<int> st;
        for(auto x: nums1) st.insert(x);
        int ans=INT_MAX;
        bool commonExists=false;
        for(auto y: nums2){
            if(st.find(y)!=st.end()){
                ans=min(ans, y);
                if(!commonExists) commonExists=true;
            }
        }
        return commonExists? ans:-1;
    }
};