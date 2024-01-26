class Solution {

    // brute force
    public int characterReplacement2(String s, int k) {
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

    public int maxF(int freqMap[]){
        int max=0;
        for(int a: freqMap) max=Math.max(max, a);
        return max;
    }
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0;
        int j=0;
        int freqMap[]=new int[256];
        int ans=0;
        while(j<n){
            freqMap[s.charAt(j)]++;
            int currAns=j-i+1;
            while(currAns-maxF(freqMap)>k && i<=j){
                freqMap[s.charAt(i)]--;
                i++;
                currAns=j-i+1;
            }
            ans=Math.max(currAns, ans);
            j++;
        }
        return ans;
    }
}