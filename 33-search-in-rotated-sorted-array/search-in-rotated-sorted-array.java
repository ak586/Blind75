class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>=arr[0]){
                // fallse in the left side
                if(target>=arr[i] && target<arr[mid]) j=mid-1;
                else i=mid+1;
            }
            else{
                if(target>arr[n-1] || target<arr[mid]) j=mid-1;
                else i=mid+1;
            }
            // System.out.println(arr[mid]+" mid "+mid);

        }
        return -1;
    }
}