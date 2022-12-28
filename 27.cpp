/*
class Solution {
public:
    int minStoneSum(vector<int>& piles, int k) {
        int n = piles.size();
        priority_queue<int> pq;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            pq.push(piles[i]);
            ans += piles[i];
        }
        while(k != 0) {
            int x = pq.top();
            ans -= x;
            pq.pop();
            x -= (x / 2);
            if(x > 0) {
                ans += x;
                pq.push(x);
            }
            k--;
        }
        return ans;
    }
};
*/