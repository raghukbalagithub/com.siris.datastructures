package com.siris.datastructures.tree;

import apple.laf.JRSUIUtils;

public class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    TreeNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
