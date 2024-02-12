class Solution {
public:
int unique3(vector<int> v)
{
    int ans = 0;
    int pow = 1;

    for (int i = 0; i < 32; i++)
    {
        int curr_bit_sum = 0;
        for (auto &x : v)
        {
            curr_bit_sum += (x & 1);
            x >>= 1;
        }
        // cout << curr_bit_sum << endl;

        if (curr_bit_sum % 3)
            ans = ans + pow;
        pow <<= 1;
    }
    return ans;
}


    int singleNumber(vector<int>& nums) {
        return unique3(nums);
    }
};