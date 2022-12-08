/*
Approach :-
1) Initialize two Lists for storing leaf nodes of 2 trees.
2) Use any of the tree traversal and store the leaf nodes data in their respective List.
3) If size of both Lists is different then return false.
4) Else iterate through both the Lists simultanously and check whether the values are equal or not. If not return false else true.
*/

// TIME COMPLEXITY :- O(N)
// SPACE COMPLEXITY :- O(N) [LIST + AUXILIARY STACK SPACE]

/*
class Solution {
    public void inorder(TreeNode root2, List<Integer> store2) {
        if(root2 == null) {
            return;
        }
        inorder(root2.left, store2);
        if(root2.left == null && root2.right == null) {
            store2.add(root2.val);
        }
        inorder(root2.right, store2);
    }
    public void postorder(TreeNode root1, List<Integer> store1) {
        if(root1 == null) {
            return;
        }
        postorder(root1.left, store1);
        postorder(root1.right, store1);
        if(root1.left == null && root1.right == null) {
            store1.add(root1.val);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> store1 = new ArrayList<>();
        postorder(root1, store1);
        List<Integer> store2 = new ArrayList<>();
        inorder(root2, store2);
        if(store1.size() != store2.size()) {
            return false;
        }
        for(int i = 0; i < store1.size(); i++) {
            if(store1.get(i) != store2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
*/