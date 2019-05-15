import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null) {
            return left==right;
        } 
        if(left.val != right.val) {
            return false;
        }
        return isSymmetricHelp(left.left, right.right) 
            && isSymmetricHelp(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }
    
    
}

