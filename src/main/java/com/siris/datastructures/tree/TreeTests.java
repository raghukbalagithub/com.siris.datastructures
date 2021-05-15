package com.siris.datastructures.tree;

public class TreeTests {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(5);

        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(6);
        root.left = l1;
        root.right = r1;

        TreeNode l1_l = new TreeNode(1);
        TreeNode l1_r = new TreeNode(0);
        l1.left = l1_l;
        l1.right = l1_r;

        TreeNode r1_l = new TreeNode(8);
        TreeNode r1_r = new TreeNode(4);
        r1.left = r1_l;
        r1.right = r1_r;

        TreeFunctions t = new TreeFunctions();
        System.out.println("\nInOrder Traversal:");
        t.inOrderTraversal(root);
        System.out.println("\nPreOrder Traversal:");
        t.preOrderTraversal(root);
        System.out.println("\nPostOrder Traversal:");
        t.postOrderTraversal(root);

        System.out.println("\nHeight of Tree: " +t.heightOfTree(root));
    }
}
