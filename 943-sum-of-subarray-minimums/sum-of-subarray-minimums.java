class Solution {
    void findNSR(int []arr, int []NSR){
        int n=arr.length;
        int i=n-1;
        Stack<Integer> st=new Stack<>();
        while(i>=0){

            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.size()==0) NSR[i]=n;
            else NSR[i]=st.peek();
            st.push(i);
            i--;
        }
    }

    public void findNSL(int []arr, int []NSL){
        Stack<Integer> st=new Stack<>();
        int i=0;
        int n=arr.length;

        while(i<n){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) NSL[i]= -1;
            else NSL[i]=st.peek();
            st.push(i);
            i++;
        }
    }


    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int NSL[]=new int[n];
        int NSR[]= new int[n];
        findNSR(arr, NSR);
        findNSL(arr, NSL);
        // System.out.println(Arrays.toString(NSL));
        // System.out.println(Arrays.toString(NSR));

        long ans=0;
        int m= (int)1e9+7;
        for(int i=0; i<n; i++){
            int left=i-NSL[i];
            int right=NSR[i]-i;
            ans= (ans + ((long)left*right*arr[i])%m)%m;
        }
        return (int)ans;

    }
}