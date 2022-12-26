/*
class Solution {
public:
    bool solve(vector<int>& nums, int idx, vector<int> & dp) {
        if(idx >= nums.size()) {
            return false;
        }
        if(idx == nums.size() - 1) {
            return true;
        }
        if(!dp[idx]) {
            return dp[idx];
        }
        int x = nums[idx];
        while(x >= 1) {
            bool destination = solve(nums, idx + x, dp);
            if(destination) {
                return dp[idx] = true;
            }
            x--;
        }
        return dp[idx] = false;
    }
    bool canJump(vector<int>& nums) {
        vector<int> dp(nums.size(), -1);
        return solve(nums, 0, dp);
    }
};
*/