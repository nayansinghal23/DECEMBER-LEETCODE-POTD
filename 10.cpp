// TIME COMPLEXITY : O(N);
// SPACE COMPLEXITY : O(N); [AUXILIARY STACK SPACE]

/*
class Solution {
public:
    int solve(TreeNode* root, int & ans) {
        if(root == NULL) {
            return 0;
        }
        int l = max(0, solve(root->left, ans));
        int r = max(0, solve(root->right, ans));
        ans = max(ans, l + r + root->val);
        return max(l, r) + root->val;;
    }
    int maxPathSum(TreeNode* root) {
        if(root->left == NULL && root->right == NULL) {
            return root->val;
        }
        int ans = INT_MIN;
        solve(root, ans);
        return ans;
    }
};
*/