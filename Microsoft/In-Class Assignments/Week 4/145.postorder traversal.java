class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return postorder(root,list);
    }
    public List<Integer> postorder(TreeNode root,List list){
        if(root!=null){
            postorder(root.left,list);
            postorder(root.right,list);
            list.add(root.val);
        }
        return list;
    }
}
