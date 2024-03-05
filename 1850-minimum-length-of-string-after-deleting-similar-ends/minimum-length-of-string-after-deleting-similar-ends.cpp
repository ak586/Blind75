class Solution {
public:
    int minimumLength(string s) {
        int ans=s.size();
        int i=0;
        int j=ans-1;
        while(i<j){
            if(s[i]!=s[j]) break;
            char temp=s[i];
            while(i<j && s[i]==temp){
                i++;
                ans--;
            }
            while(j>=i && s[j]==temp){
                j--;
                ans--;
            }
        }
        return ans;
    }
};