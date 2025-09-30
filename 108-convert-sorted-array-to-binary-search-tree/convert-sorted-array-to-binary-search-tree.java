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
     private TreeNode CreateBST(int nums[], int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2; 
        TreeNode root = new TreeNode(nums[mid]);
        root.left = CreateBST(nums, l, mid - 1); 
        root.right = CreateBST(nums, mid + 1, r); 
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       return CreateBST(nums, 0, nums.length - 1);
    }
}