/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums,0,nums.length-1);
    }
    public static TreeNode constructBST(int []nums, int l,int r){
        // if l>r then we cant calculate mid so return null;
        if(l>r) return null;
        // calculate mid;
        int mid = l + (r-l)/2;
        // this mid is our root
        TreeNode root = new TreeNode(nums[mid]);
        // construct left and right subtrees of root
        root.left = constructBST(nums,l,mid-1);
        root.right = constructBST(nums,mid+1,r);
        // return root;
        return root;
    }
}
