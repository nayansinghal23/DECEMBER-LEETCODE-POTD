/*
 class Solution {
    int mod = 1000000007;
    public int f(int n) {
        if(n <= 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        return ((2 * f(n - 1)) % mod + f(n - 3)) % mod;
    }
    public int numTilings(int n) {
        return f(n);
    }
}
 */

/*
 class Solution {
    int mod = 1000000007;
    public int f(int n, int[] dp) {
        if(n <= 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = ((2 * f(n - 1, dp)) % mod + f(n - 3, dp)) % mod;
    }
    public int numTilings(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
}
 */