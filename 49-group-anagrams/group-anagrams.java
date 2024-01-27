class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Sort the array 
        // sort the current string and use map to store the list
        Arrays.sort(strs);
        // System.out.print(Arrays.toString(strs));
        Map<String, ArrayList<String>>map=new HashMap<>();
        int n=strs.length;
        for(int i=0; i<n; i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            // System.out.println(str);
            ArrayList<String> temp=new ArrayList<>();
            if(map.get(str)!=null){
                temp=map.get(str);
                temp.add(strs[i]);
                map.put(str, temp);
            }
            else{
                temp.add(strs[i]);
                map.put(str, temp);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(String st: map.keySet()){
            ans.add(map.get(st));
        } 
        return ans;
    }
}
