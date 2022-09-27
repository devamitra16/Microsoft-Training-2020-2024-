class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            else{
                root.val=successor(root.right);
                root.right=deleteNode(root.right,root.val);
            }
        }
        return root;
    }
    public int successor(TreeNode root){
        if(root.left==null){
            return root.val;
        }else{
            return successor(root.left);
        }
    }
}
