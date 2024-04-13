class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.size()!=goal.size()) return false;
        int i=0; 
        int n=s.size();
        while(i<n){
            if(s[i]==goal[0]){
                string temp=s.substr(i, n) +s.substr(0, i);
                if(temp==goal) return true;
            }
            i++;
        }
        return false;
    }
};