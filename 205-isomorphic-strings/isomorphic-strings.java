class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1=new HashMap<>();
        Map<Character, Character> map2=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char sc=s.charAt(i);
            char st=t.charAt(i);
            if(map1.containsKey(sc) && map1.get(sc)!=st) return false;
            else if(map2.containsKey(st) && map2.get(st)!=sc)return false;
            map1.put(sc, st);
            map2.put(st, sc);
        }
        return true;
    }
}