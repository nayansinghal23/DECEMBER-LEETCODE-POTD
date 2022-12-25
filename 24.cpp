/*
class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
        sort(nums.begin(), nums.end());
        int m = queries.size();
        int n = nums.size();
        vector<int> ans(m, 0);
        for(int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        vector<pair<int, int> > query(m);
        for(int i = 0; i < m; i++) {
            query[i].first = queries[i];
            query[i].second = i;
        }
        sort(query.begin(), query.end());
        for(int i = 0; i < m; i++) {
            int low = 0, high = n - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(nums[mid] > query[i].first) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
                ans[query[i].second] = low;
            }
        }
        return ans;
    }
};
*/