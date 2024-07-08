class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0; 
        int j=0;
        while(j<arr.length){
            if(i==j) j++;
           else if(arr[i]==arr[j]) j++;
            else{
                arr[++i]=arr[j++];
            }
        }
        return i+1;
    }
}