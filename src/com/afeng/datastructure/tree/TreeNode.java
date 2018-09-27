package com.afeng.datastructure.tree;

/**
 * @author afeng
 * @date 2018/9/26 11:00
 **/
public class TreeNode<T>
{
    T data;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

     TreeNode()
    {
        this.data = null;
        this.leftChild = null;
        this.rightChild = null;
    }


     TreeNode(T data)
    {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }


    public TreeNode(T data, TreeNode<T> leftChild, TreeNode<T> rightChild)
    {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public TreeNode<T> getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild)
    {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild)
    {
        this.rightChild = rightChild;
    }
}
