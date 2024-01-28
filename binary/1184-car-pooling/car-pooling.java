class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
    if (a[0] != b[0]) {
        return a[0] - b[0]; // Compare based on the first element
    } else {
        return a[1] - b[1]; // If the first elements are equal, compare based on the second element
    }
});
        int row=trips.length;
        for(int i=0; i<row ;i++){
            int arr1[]={trips[i][1], trips[i][0]};
            int arr2[]={trips[i][2], -1*trips[i][0]};
            pq.add(arr1);
            pq.add(arr2);
        }

        int curr=0;
        while(pq.size()>0){
            int arr2[]=pq.poll();
            curr+=arr2[1];
            // System.out.println(curr);
            // System.out.println(Arrays.toString(arr2));
            if(curr>capacity) return false;
        }
        return true;
    }
}