class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), -1);
                continue;
            }
            map.put(s.charAt(i), i);
        }
        int ans=s.length();
        for(char key:map.keySet()){
            if(map.get(key)==-1)continue;
            ans=Math.min(map.get(key), ans);
        }
        if(ans==s.length()) return -1;
        return ans;
    }
}