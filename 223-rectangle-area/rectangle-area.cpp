class Solution {
public:
    int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l_overlap=min(ax2, bx2)-max(ax1, bx1);
        int w_overlap=min(ay2, by2)-max(ay1, by1);
        l_overlap=max(0, l_overlap);
        w_overlap=max(0, w_overlap);
        int common_area=l_overlap*w_overlap;
        int a1=(ax2-ax1)*(ay2-ay1);
        int a2=(bx2-bx1)*(by2-by1);
        // cout<<a1<<" "<<a2<<endl;
        return a1+a2-common_area;
    }
};