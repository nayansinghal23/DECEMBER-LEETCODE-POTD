/* Approach :-
1) Traverse a tree and first calculate the total sum of tree.
2) Again traverse the tree in same manner and for each node calculate the sum of its subtree. Subtract that sum from total sum of tree.
3) Product the two i.e. subtracted sum and calculated sum and maximize it.
4) Return the current sum of subtree.
*/

// Time complexity :- O(N)
// Space complexity :- O(N) [AUXILIARY STACK SPACE]

/*
 class Solution {
    long result = Integer.MIN_VALUE;
    private int solve(TreeNode root, int totalSum) {
        if(root == null) {
            return 0;
        }
        int l = solve(root.left, totalSum);
        int r = solve(root.right, totalSum);
        int currSum = (l + r + root.val);
        int remainSum = totalSum - currSum;
        result = Math.max(result, 1l * currSum * remainSum);
        return currSum;
    }
    public int calcSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int l = calcSum(root.left);
        int r = calcSum(root.right);
        return r + l + root.val;
    }
    public int maxProduct(TreeNode root) {
        int MOD = 1000000007;
        int totalSum = calcSum(root);
        int ans = Integer.MIN_VALUE;
        solve(root, totalSum);
        return (int)(result % MOD);
    }
}
 */