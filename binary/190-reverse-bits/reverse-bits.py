class Solution:
    def reverseBits2(self, n: int) -> int:
        for i in range(16):
            left = (n >> (31 - i )) & 1
            right = (n >> i) & 1
            if left != right:
                # Flip the bits
                n = n ^ (1 << (31 - i ))
                n = n ^ (1 << i)
        return n
        
    def reverseBits(self, n:int)->int:
        ans=0
        for i in range(32):
            ans=ans<<1
            ans=ans|(n & 1)
            n=n>>1
        return ans

