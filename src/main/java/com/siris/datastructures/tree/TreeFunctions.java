package com.siris.datastructures.tree;

public class TreeFunctions {

    public void inOrderTraversal(TreeNode root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(" " +root.key + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root) {
        if(root != null) {
            System.out.print(" " +root.key + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root) {
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(" " +root.key + " ");
        }
    }

    public int heightOfTree(TreeNode root) {
        if(root == null) {
            return 0;
        } else {
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
        }
    }
}
