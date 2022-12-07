// TIME COMPLEXITY :- O(N)
// SPACE COMPLEXITY :- O(N)

/*
class Solution {
public:
    void solve(TreeNode* root, int low, int high, int & sum) {
        if(root == NULL) {
            return;
        }
        solve(root->left, low, high, sum);
        if(root->val >= low && root->val <= high) {
            sum += root->val;
        }
        solve(root->right, low, high, sum);
    }
    int rangeSumBST(TreeNode* root, int low, int high) {
        int sum = 0;
        solve(root, low, high, sum);
        return sum;
    }
};
*/