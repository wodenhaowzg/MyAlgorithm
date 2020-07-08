package com.example.myalgorithm.tree;

// 二叉树
public class BinaryTree {

    private static final String TAG = "BinaryTree";
    public BinaryTreeNode rootBinaryTreeNode; // 结点数组
    private int mDepth; // 树的深度
    private int mNodeNum; // 结点数量
    private int mCreateIndex;

    public void preOrderTraverse(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println("Print : " + node.toString());
        preOrderTraverse(node.mLeftChildNode);
        preOrderTraverse(node.mRightChildNode);
    }

    public void preOrderTraverse2(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println("value : " + node.mData);
        printNode(node.mLeftChildNode, node.mRightChildNode);
        preOrderTraverse(node.mLeftChildNode);
        preOrderTraverse(node.mRightChildNode);
    }

    private void printNode(BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
        if (leftNode.mLeftChildNode != null) {
            System.out.println("value : " + leftNode.mLeftChildNode.mData);
        }

        if (rightNode.mRightChildNode != null) {
            System.out.println("value : " + rightNode.mRightChildNode.mData);
        }
    }

    // 根据传入的字符串，前序方式创建
    public BinaryTreeNode createBinaryTree(String[] strs) {
        String str = strs[mCreateIndex];
        mCreateIndex++;

        if (!str.equals("#")) {
            BinaryTreeNode node = new BinaryTreeNode();
            node.mData = str;
            node.mLeftChildNode = createBinaryTree(strs);
            node.mRightChildNode = createBinaryTree(strs);
            return node;
        }
        return null;
    }

    public BinaryTreeNode createInorderBinaryTree(String[] strs) {
        String str = strs[mCreateIndex];
        mCreateIndex++;

        if (!str.equals("#")) {
            BinaryTreeNode node = new BinaryTreeNode();
            node.mLeftChildNode = createBinaryTree(strs);
            node.mData = str;
            node.mRightChildNode = createBinaryTree(strs);
            return node;
        }
        return null;
    }

//    public TreeNode constructFromPrePost(int[] pre, int[] post) {
//
//
//    }

    private int findPosition(int value, int[] pre){
        int index = 0;
        for (int i : pre) {
            if (i == value) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
