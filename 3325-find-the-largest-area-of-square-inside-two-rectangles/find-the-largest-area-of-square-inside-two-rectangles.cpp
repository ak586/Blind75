class Solution {
public:

    bool isOverlapping(int ax1, int ax2, int ay1, int ay2, int bx1, int bx2, int by1, int by2){
        bool left=ax2<=bx1;
        bool right= bx2<=ax1;
        
        bool top= ay1>=by2;
        bool bottom=by1>=ay2;
        return !(left||right||top||bottom);
    }
    
    long long  overlaping_area(int ax1, int ax2, int ay1, int ay2, int bx1, int bx2, int by1, int by2){
        long long width=abs(max(ax1, bx1)-min(ax2, bx2));
        long long height=abs(max(ay1, by1)-min(ay2, by2));
        height=min(height, width);
        width=height;
        return abs(width*height);
    }
    
    long long largestSquareArea(vector<vector<int>>& bl, vector<vector<int>>& tr) {
        int n=bl.size();
        long long area=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int ax1=bl[i][0];
                int ay1=bl[i][1];
                int ax2=tr[i][0];
                int ay2=tr[i][1];
                
                int bx1=bl[j][0];
                int by1=bl[j][1];
                int bx2=tr[j][0];
                int by2=tr[j][1];
                
                bool flag=isOverlapping(ax1,  ax2,  ay1,  ay2,  bx1,  bx2,  by1, by2);
                // cout<<flag<<endl;
                if(flag){
                    long long currArea=overlaping_area(ax1, ax2, ay1, ay2, bx1, bx2, by1, by2);
                    area=max(currArea, area);
                }
                
            }
        }
        return area;
    }
};