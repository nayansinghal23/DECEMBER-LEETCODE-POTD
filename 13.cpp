/*
RECURSION :-
TIME COMPLEXITY : O(2 ^ N)
SPACE COMPLEXITY : O(N) [AUXILIARY STACK SPACE]
*/

/*
MEMOIZATION :-
TIME COMPLEXITY : O(N)
SPACE COMPLEXITY : O(N) + O(N) [AUXILIARY STACK SAPCE + DP ARRAY]
*/


/*
class Solution {
public:
    int solve(vector<int> & nums, int n, vector<int> & dp) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return nums[n];
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int take = nums[n] + solve(nums, n - 2, dp);
        int notTake = 0 + solve(nums, n - 1, dp);
        return dp[n] = max(take, notTake);
    }
    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n + 1, -1);
        return solve(nums, n - 1, dp);
    }
};
*/