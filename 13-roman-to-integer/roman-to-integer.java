class Solution {
    public int romanToInt(String s) {
        char ro[]={'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int val[]= {1, 5, 10, 50, 100, 500, 1000};
        Map<Character, Integer> map=new HashMap<>();

        for(int i=0; i<val.length; i++)
            map.put(ro[i], val[i]);

        int i=s.length()-1;
        int number=0;
       while(i>=0){
            int currVal=map.get(s.charAt(i));
            number+=currVal;
            if(i>0 && map.get(s.charAt(i-1))<currVal){
                number-=map.get(s.charAt(i-1));
                i--; 
            }
            i--;
        }
        return number;
    }
}