package com.example.problem6;

//定义二叉树节点类
class BinaryTreeNode{
    int data;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;

    //无参构造函数
    public BinaryTreeNode() {
    }

    //有参构造函数
    public BinaryTreeNode(int data, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
public class ReconstructBinaryTree {
}
