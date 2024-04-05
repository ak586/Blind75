class Solution {
    public String makeGood(String s) {
        if(s.length()==1) return s;
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(st.size()==0) st.add(s.charAt(i));
            else{
                if(Math.abs(st.peek()-s.charAt(i))==32)
                    st.pop();
                else st.push(s.charAt(i));
            }
            i++;
        }
        String ans="";
        while(st.size()>0){
            ans=st.pop()+ans;
        }

        return ans;
    }
}