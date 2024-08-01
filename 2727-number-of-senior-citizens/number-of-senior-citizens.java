class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String st: details){

            if(get_age(st.substring(11,13))>60) count++;
        }
        return count;
    }
     int get_age(String str){
        int d1=str.charAt(0)-'0';
        int d2=str.charAt(1)-'0';
        return d1*10+d2;
     }
}