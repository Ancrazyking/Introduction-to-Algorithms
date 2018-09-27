package com.afeng.datastructure.tree;

/**
 * @author afeng
 * @date 2018/9/26 11:48
 **/
public class Tree
{
    public Node root;

    /**
     * 插入节点
     *
     * @param value
     */
    public void insert(int value)
    {
        //要插入的节点
        Node newNode = new Node(value);
        //当前节点为根节点
        Node current = root;
        Node parent;//用于保存current每一个遍历的父节点
        //第一次插入时,root为null
        if (root == null)
        {
            root = newNode;
            return;
        } else
        {
            while (true)
            {
                //父节点指向当前节点
                parent = current;
                if (current.data > value)
                {
                    current = current.leftChild;
                    if (current == null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                } else
                {
                    current = current.rightChild;
                    if (current == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }
    }

    /**
     * 查找节点
     *
     * @param value
     */
    public Node find(int value)
    {
        //引用当前节点,从根节点开始
        Node current = root;
        while (current.data != value)
        {
            if (current.data > value)
            {
                current = current.leftChild;
            } else
            {
                current = current.rightChild;
            }

            if (current == null)
            {
                return null;
            }
        }
        return current;
    }

    /**
     * 删除节点
     *
     * @param value
     */
    public void delete(int value)
    {


    }

}
