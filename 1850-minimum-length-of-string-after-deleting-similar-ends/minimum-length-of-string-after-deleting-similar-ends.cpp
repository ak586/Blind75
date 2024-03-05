class Solution {
public:
    int minimumLength(string s) {
        int i=0;
        int j=s.size()-1;
        while(i<j){
            if(s[i]!=s[j]) break;
            char temp=s[i];
            while(i<j && s[i]==temp){
                i++;
            }
            while(j>=i && s[j]==temp){
                j--;
            }
        }
        return max(j-i+1, 0);
    }
};