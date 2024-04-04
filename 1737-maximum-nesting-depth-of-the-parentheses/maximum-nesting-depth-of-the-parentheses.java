class Solution {
    public int maxDepth(String s) {
        int count=0;
        int ans=0;
        char ch;
        for( int i=0; i<s.length(); i++){
            ch=s.charAt(i);
            if(ch=='(') count++;
            else if(ch==')') count--;
            ans=Math.max(count, ans);
        }
        return ans;
    }
}