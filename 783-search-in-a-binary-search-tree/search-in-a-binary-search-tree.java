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

/*public static void levelOrder (TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);

    while(q.size() > 0) {
        int sz = q.size();
        while(sz > 0) {
            TreeNode temp = q.remove();
            System.out.println(temp.val+ " ");

            if(temp.left != null) {
                q.add(temp.left);
            }

            if(temp.right != null) {
              q.add(temp.right);
            }
            sz--;
        }
    }
}
   */ 
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }

        if(root.val == val) {
            return root;
        }

       else if(root.val > val) {
            return searchBST(root.left,val);
        } else {
            return searchBST(root.right,val);
        }
    }
}