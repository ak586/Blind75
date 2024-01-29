class Solution {
    public int minTaps(int n, int[] ranges) {
        List<int[]> lst=new ArrayList<>();
        for (int i=0; i<=n; i++){
            if(ranges[i]==0) continue;
            int currRange[]={Math.max(0, i-ranges[i]), Math.min(n, i+ranges[i])};
            lst.add(currRange);
        } 
        Collections.sort(lst, (a, b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });
        if(lst.size()==0) return -1;
        int start=lst.get(0)[0];
        int end=lst.get(0)[1];
        int count=1;

        for(int curr[]: lst){
            System.out.println(Arrays.toString(curr));
        }
        int i=1;
        while(i<lst.size()){
            System.out.println("start "+start+"end "+end);
            System.out.println(Arrays.toString(lst.get(i)));
            if(end<lst.get(i)[0]) return -1;
            if(lst.get(i)[1]<=end) i++;
            else{
                count++;
                int end2=end;
                int start2=start;
                boolean flag=false;
                while(i<lst.size() && lst.get(i)[0]<=end){
                    flag=true;
                    if(end2<lst.get(i)[1]){
                        end2=lst.get(i)[1];
                        start2=lst.get(i)[0];
                    } 
                    i++;
                }
                if(end2>end)
                  {
                        end=end2;
                        start=start2;
                  } else count--;
                if(!flag) i++;
            }
        }
        if(end<n) return -1;
        return count;
    }
}