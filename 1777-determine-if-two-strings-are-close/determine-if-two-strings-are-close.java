class Solution {
    public boolean closeStrings(String word1, String word2) {
        return can_convert(word1, word2);
    }
     boolean can_convert(String s1, String s2){
        int map1[]=new int [26];
        int map2[]=new int [26];
        for(int i=0; i<s1.length(); i++)
            map1[s1.charAt(i)-'a']++;
        for(int j=0; j<s2.length(); j++)
            map2[s2.charAt(j)-'a']++;
        
        for(int i=0; i<26; i++){
            if(map1[i]!=0 && map2[i]==0) return false;
        }
        Arrays.sort(map1);
        Arrays.sort(map2);
        return Arrays.equals(map1, map2);
    }
}