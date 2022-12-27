/*
class Solution {
public:
    int maximumBags(vector<int>& capacity, vector<int>& rocks, int additionalRocks) {
        for(int i=0;i<capacity.size();i++) capacity[i] = capacity[i] - rocks[i];
        sort(begin(capacity),end(capacity));
        int cnt = 0;
        for(auto it : capacity){
            if(it == 0){ 
                cnt++;
                continue;
            }
            additionalRocks -= it;
            if(additionalRocks >=0) cnt++;
            else break;
        }
        return cnt;
    }
};
*/