class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        ans.add(prev);

        for(int i=1; i<numRows; i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(prev.get(0));
            for(int j=1; j<prev.size(); j++)
                curr.add(prev.get(j)+prev.get(j-1));
            curr.add(prev.get(prev.size()-1));
            ans.add(curr);
            prev=curr;
        }
        return ans;
    }
}