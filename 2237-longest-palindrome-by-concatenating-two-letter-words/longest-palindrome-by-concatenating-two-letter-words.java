class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map=new HashMap<>();
        for(String str: words){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        int ans=0;
        int duplicate_count=0;
        for(int i=0; i<words.length; i++){
            StringBuilder temp=new StringBuilder(words[i]);
            String reversed=new String(temp.reverse());
            if(map.get(words[i])==0 || map.getOrDefault(reversed,0)<=0 ) continue;
            if(reversed.equals(words[i])){
            if(map.get(words[i])>=2){
                     map.put(words[i], map.get(words[i])-2);
                     ans+=4;
                }
                 else if(duplicate_count==0){
                    map.put(words[i], map.get(words[i])-1);
                    ans+=2;
                    duplicate_count++;
                }
                continue;
            }

            map.put(words[i], map.get(words[i])-1);
            map.put(reversed, map.get(reversed)-1);
            ans+=4;
        }
        return ans;
}
}