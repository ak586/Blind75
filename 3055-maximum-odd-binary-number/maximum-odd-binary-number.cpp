class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int one=0;
        
        for(auto &ch: s){
            if(ch=='1') one++;
            ch='0';
        }
        s[s.size()-1]='1';
        --one;
        for(int i=0; i<one; i++){
            s[i]='1';
        }
        return s;
    }
};