class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       return optimised(A, B);
    }
    public int[] optimised(int[] A, int[] B) {
        HashMap<Integer, Integer>map=new HashMap<>();
        int ans[]=new int[A.length];
        int common=0;
        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])) common++;
            map.put(A[i], map.getOrDefault(A[i],0)+1);
            if(map.containsKey(B[i])) common++;
            map.put(B[i], map.getOrDefault(B[i], 0)+1);
            ans[i]=common;
        }
        return ans;
    }

    
    
    public int[] bruteForce(int A[], int []B){
        int ans[]=new int[A.length];
        Map<Integer, Integer>map1=new HashMap<>();
        Map<Integer, Integer>map2=new HashMap<>();
        
        for(int i=0; i<A.length;i++){
            map1.put(A[i], map1.getOrDefault(A[i], 0)+1);
            map2.put(B[i], map2.getOrDefault(B[i], 0)+1);
            for(int k: map1.keySet()){
                ans[i]+=Math.min(map1.get(k), map2.getOrDefault(k, 0));
            }
            
        }
        return ans;
    }
}