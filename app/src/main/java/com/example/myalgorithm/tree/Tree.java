package com.example.myalgorithm.tree;

public class Tree {

    private Node[] mNodes; // 结点数组
    private int mDepth; // 树的深度
    private int mNodeNum; // 结点数量

    // 双亲表示法
    private static class Node {

        private int mParentIndex; // 双亲位置
        private int mData; // 结点数据
    }

    // 孩子表示法
//    private static class Node {
//
//        private Node mNextNode;
//        private int mChildsSize;
//    }

    // 孩子兄弟表示法
//    private static class Node {
//
//        private Node mFistChild; // 第一个孩子结点
//        private Node mRightsib; // 孩子的兄弟结点
//    }
}
