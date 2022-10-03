class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return helper(root.left,root.right);

    }
    public boolean helper(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        else if(left!=null && right!=null){
            return (left.val==right.val) && helper(left.left,right.right) && helper(left.right,right.left);
        }
        return false;
    }
}
