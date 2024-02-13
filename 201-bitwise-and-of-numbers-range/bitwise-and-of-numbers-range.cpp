class Solution {
public:

    int rangeBitwiseAnd(int left, int right){
        int i=0;
        while(left!=right){
            left>>=1;
            right>>=1;
            i++;
        }
        return left<<i;
    }


    // int rangeBitwiseAnd(int left, int right) {

    //     for (int i=0; i<31; i++){
    //         int x=1<<i;
    //         if(x-1>=left && x<=right) return 0;
    //     }
    //     int ans=left;
    //     while(left<right){
    //         ans&=right;
    //         right--;
    //     }
    //     return ans;
    // }
};