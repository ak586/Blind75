class Solution {
public:
    int rangeBitwiseAnd(int left, int right) {

        for (int i=0; i<31; i++){
            int x=1<<i;
            if(x-1>=left && x<=right) return 0;
        }
        int ans=left;
        while(left<right){
            ans&=right;
            right--;
        }
        return ans;
    }
};