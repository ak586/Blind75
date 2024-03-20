class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans=new ArrayList<>();
        int arr1[]=new int[26];
        
       for(int i=0; i<words[0].length(); i++){
            arr1[words[0].charAt(i)-'a']++;
       }
       for(int i=1; i<words.length; i++){
            int arr2[]=new int[26];
            for(int j=0; j<words[i].length(); j++)
            arr2[words[i].charAt(j)-'a']++;
            for(int k=0; k<26; k++)
                arr1[k]=Math.min(arr1[k], arr2[k]);
       }
    //    System.out.println(Arrays.toString(arr1));
       for(int i=0; i<26; i++){
        if(arr1[i]==0) continue;
        char ch=(char)(i+'a');
        for(int freq=0; freq<arr1[i]; freq++)
            ans.add(""+ch);
       }
        return ans;
    }
}