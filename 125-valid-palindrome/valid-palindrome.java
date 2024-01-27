class Solution {
    public boolean isPalindrome(String s) {
        int i=0; 
        int j=s.length()-1;
        int n=s.length();
        while(i<j){
            while(i<n && !Character.isLetterOrDigit(s.charAt(i))) ++i;
            while(j>=0 && !Character.isLetterOrDigit(s.charAt(j))) --j;
            if(i>j) break;
            char left=Character.toLowerCase(s.charAt(i));
            char right=Character.toLowerCase(s.charAt(j));
            if(left!=right) return false;
            i++;
            j--;
        }
        return true;
    }
}