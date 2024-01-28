class Solution:
    def countBits(self, n: int) -> List[int]:
        ans=[0 for i in range(n+1)]
        for i in range(1, n+1):
            if(i&1==0):
                ans[i]=ans[i//2]
            else: ans[i]=1+ans[i//2]
        return ans
        
        
            
        