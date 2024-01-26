class Solution {
    public boolean condIsValid(int freqMap[]){
        for(int x: freqMap)
        if(x>1) return false;
        return true;
    }

    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int freqMap[]=new int[256];
        int ans=0;
        while(j<n){

            freqMap[s.charAt(j)]++;
            while(!condIsValid(freqMap) && i<=j){
                freqMap[s.charAt(i)]--;
                i++;
            }
            ans=Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}