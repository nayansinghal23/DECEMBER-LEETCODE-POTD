/*
RECURSION :-
TIME COMPLEXITY : O(3 ^ (N ^ 2))
SPACE COMPLEXITY : O(N) [AUXILIARY STACK SPACE]
*/

/*
MEMOIZATION :-
TIME COMPLEXITY : O(N)
SPACE COMPLEXITY : O(N) + O(N ^ 2) [AUXILIARY STACK SAPCE + DP ARRAY]
*/

/*
class Solution {
    public int solve(int[][] matrix, int n, int i, int j, int[][] dp) {
        if(j < 0 || j >= n) {
            return (int)Math.pow(10, 9);
        }
        if(i == 0) {
            return matrix[i][j];
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int up = solve(matrix, n, i - 1, j, dp) + matrix[i][j];
        int leftDiagonal = solve(matrix, n, i - 1, j - 1, dp) + matrix[i][j];
        int rightDiagonal = solve(matrix, n, i - 1, j + 1, dp) + matrix[i][j];
        return dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        for(int j = n - 1; j >= 0; j--) {
            ans = Math.min(ans, solve(matrix, n, n - 1, j, dp));
        }
        return ans;
    }
}
 */