class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int left=0;
        int right=s.size()-1;
        int firstOne=right;
        while(firstOne>=0){
            if(s[firstOne]=='1') break;
            firstOne--;
        }
        swap(s[firstOne], s[right]);
        right--;
        while(left<right){
          
            if(s[right]=='1'){
                while(left<right && s[left]=='1') left++;
                swap(s[right], s[left]);
                left++;
            }
            right--;
        }
        return s;
    }
};