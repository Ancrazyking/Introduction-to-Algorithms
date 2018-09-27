package com.afeng.datastructure.tree;

/**
 * @author afeng
 * @date 2018/9/26 12:50
 **/
public class MyTree
{
    public static void main(String[] args)
    {
        /**
         * 按照顺序插入
         */
        Tree tree = new Tree();
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(0);
        System.out.println(tree.root.data);//2 根节点的值为2
        System.out.println(tree.root.rightChild.data);//3
        System.out.println(tree.root.leftChild.data);//1
        System.out.println(tree.root.leftChild.leftChild.data);//0
    }


}
