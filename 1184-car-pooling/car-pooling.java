class Solution {
    // with sorting or using pq
    public boolean carPooling2(int[][] trips, int capacity) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
    if (a[0] != b[0]) {
        return a[0] - b[0]; 
    } else {
        return a[1] - b[1]; 
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
            if(curr>capacity) return false;
        }
        return true;
    }
    // without sorting
    public boolean carPooling(int[][] trips, int capacity) {
        int t[]=new int[1001];
        for (int arr[]: trips){
            t[arr[1]]+=arr[0];
            t[arr[2]]-=arr[0];
        }

        int currPassenger=0;
        for (int a: t){
            currPassenger+=a;
            if(currPassenger>capacity) return false;
        }
        return true;
    }
}