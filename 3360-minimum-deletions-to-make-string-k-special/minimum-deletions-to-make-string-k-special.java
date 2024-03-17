class Solution {
    public int minimumDeletions(String word, int k) {
        List<Integer> lst=new ArrayList<>();
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<word.length(); i++){
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0)+1);
        }
        for (char ch: map.keySet())
            lst.add(map.get(ch));
        Collections.sort(lst, Collections.reverseOrder());
                int ans = Integer.MAX_VALUE;
        System.out.println(lst);
        for (int x: lst) {
            int currDel = 0;
            for(int freq: lst){
                if(freq>x+k){
                    currDel+=freq-x-k;
                }else if(freq<x){
                    currDel+=freq;
                }
            }
            ans = Math.min(ans, currDel);
            if(currDel==0) break;
        }
        
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;

    }
}