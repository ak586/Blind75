class Solution {
public:
    vector<int> decode(vector<int>& encoded) {
        int i=1;
        int n=encoded.size();
        int total=0;
        while(i<=n+1){
            total^=i;
            i++;
        }
        i=1;
        int temp=0;
        while(i<n){
            temp^=encoded[i];
            i+=2;
        }

        int first=total^temp;
        i=0;
        vector<int> ans;
        ans.push_back(first);
        int p=first;
        while(i<n){
            int curr=p^encoded[i];
            ans.push_back(curr);
            p=curr;
            i++;
        }
        return ans;


    }
};