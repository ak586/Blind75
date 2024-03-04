class Solution {
public:
    

    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(), tokens.end());
        int maxScore=0;
        int score=0;
        int i=0;
        int j=tokens.size()-1;
        while(i<=j && score>=0){
            if(tokens[i]<=power){
                score++;
                power-=tokens[i];
                ++i;
            }
            else{
                // if(score<=0) return 0;
                power+=tokens[j];
                score--;
                --j;
            }
            maxScore=max(score, maxScore);
        }
        return maxScore;
    }
};