class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int ans=0;
        for(int i=0; i<n; i++){
            int freqMap[]=new int[256];
            int maxFreq=0;
            for (int j=i; j<n;j++){
                char ch=s.charAt(j);
                freqMap[ch]++;
                maxFreq=Math.max(freqMap[ch],maxFreq);
                int currAns= j-i+1;
                if(currAns-maxFreq>k){
                    break;
                } 
                ans=Math.max(currAns, ans);
            }
        }
        return ans;
    }
}