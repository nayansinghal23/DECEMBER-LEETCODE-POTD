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
    // RECURRSIVE SOLUTION
    
    // int solve(int n) {
    //     if(n < 0) {
    //         return 0;
    //     }
    //     if(n == 0) {
    //         return 1;
    //     }
    //     int left = solve(n - 1);
    //     int right = solve(n - 2);
    //     return left + right;
    // }
    

    // MEMOIZATION  
    int solve(int n, vector<int> & dp) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int left = solve(n - 1, dp);
        int right = solve(n - 2, dp);
        return dp[n] = left + right;
    }
    int climbStairs(int n) {
        vector<int> dp(n + 1, -1);
        return solve(n, dp);
    }
};
*/