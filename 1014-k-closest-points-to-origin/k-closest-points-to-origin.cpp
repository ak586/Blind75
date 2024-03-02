class Solution {
public:
    static bool helper(vector<int>p1, vector<int>p2){
        long long a=p1[0];
        long long b=p1[1];

        long long c=p2[0];
        long long d=p2[1];

        long long dist1=a*a+b*b;
        long long dist2= c*c+d*d;
        return dist1< dist2 ;

    }

    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        sort(points.begin(), points.end(),helper);
        vector<vector<int>> ans;
        for(int i=0; i<k; i++){
            ans.push_back(points[i]);
        }
        return ans;
    }
};