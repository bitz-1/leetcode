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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root ==null)
        return 0;
        int sum = 0;

    // exploring left sub tree 
    if (root.val > low)
    sum += rangeSumBST(root.left , low , high);

    // if value is in range add it to sum 
    if (root.val >= low && root.val <= high)
    sum += root.val;

    // Explore the right sub-tree only if required 

    if(root.val < high)
    sum += rangeSumBST(root.right , low, high);

    return sum;


    }
}

https://leetcode.com/problems/range-sum-of-bst/submissions/1140379707?envType=daily-question&envId=2024-01-08
