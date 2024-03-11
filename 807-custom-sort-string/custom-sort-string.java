class Solution {
    public String customSortString(String order, String s) {
        char ord[]=order.toCharArray();
        char arr2[]=s.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();
         Character arr[]= new Character[arr2.length];
 
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];
        }

        for (char ch: order.toCharArray()) {
            map.put(ch,order.indexOf(ch)+1);
        }

        Arrays.sort(arr, new Comparator<Character>() {
    public int compare(Character c1, Character c2) {
        int x = map.getOrDefault(c1, 28);
        int y = map.getOrDefault(c2, 28);
        return Integer.compare(x, y);
    }
    });
    StringBuilder sb
            = new StringBuilder(arr.length);
        for (Character c : arr)
            sb.append(c.charValue());
        return sb.toString();
    }
}