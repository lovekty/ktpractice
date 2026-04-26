package me.tony.practice;

public class BinSearchTree {

    public boolean validBinSearchTree(Node root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.value < min) {
            return false;
        }
        if (max != null && root.value > max) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.left.value > root.value ) {
            return false;
        }
        if (root.right != null && root.right.value < root.value ) {
            return false;
        }
        return validBinSearchTree(root.left, null, root.value) && validBinSearchTree(root.right, root.value, null);
    }


    public static class Node {
        int value;
        Node left;
        Node right;
    }
}
