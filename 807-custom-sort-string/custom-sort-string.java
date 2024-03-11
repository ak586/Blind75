class Solution {
    public String customSortString(String order, String s) {
        // HashMap<Character, Integer> map=new HashMap<>();
         Character arr[]= new Character[s.length()];
         int n=s.length();
        for (int i = 0; i <n; i++) {
            arr[i] = s.charAt(i);
        }

        // for (char ch: order.toCharArray()) {
        //     map.put(ch,order.indexOf(ch)+1);
        // }


    Arrays.sort(arr, new Comparator<Character>() {
    public int compare(Character c1, Character c2) {
        int x = order.indexOf(c1)+1;
        int y = order.indexOf(c2)+1;
        return Integer.compare(x, y);
    }
    });

    StringBuilder sb
            = new StringBuilder(n);
        for (Character c : arr)
            sb.append(c.charValue());
        return sb.toString();
    }
}