package com.example.myalgorithm.tree;

public class BinaryTreeNode {

    public int mParentIndex; // 添加双亲位置索引，解决查找父结点不方便的问题。
    public String mData;
    public BinaryTreeNode mLeftChildNode; // 左边孩子结点
    public BinaryTreeNode mRightChildNode; // 右边兄弟结点

    @Override
    public String toString() {
        return "Node{" +
                "mParentIndex=" + mParentIndex +
                ", mData=" + mData +
                '}';
    }
}
