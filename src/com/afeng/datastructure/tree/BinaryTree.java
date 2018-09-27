package com.afeng.datastructure.tree;

/**
 * @author afeng
 * @date 2018/9/26 11:04
 **/
public class BinaryTree<T>
{
    /**
     * 树的根节点
     */
    private TreeNode<T> root;

    /**
     * 构造函数创建根节点
     */
    public BinaryTree()
    {
        TreeNode<T> rootNode = new TreeNode<>();
        this.root = rootNode;
    }

    public static void main(String[] args)
    {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int i = 1; i <= 10; i++)
        {
            tree.buildBinaryTree(tree.root, i);
        }


    }

    /**
     * 判断是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return root == null;
    }

    /**
     * 获取根节点
     *
     * @return
     */
    public TreeNode<T> getRoot()
    {
        return this.root;
    }

    /**
     * 构建二叉树
     *
     * @param node
     * @param data
     */
    public void buildBinaryTree(TreeNode<T> node, T data)
    {
        if (root == null)
        {
            root = new TreeNode<T>();
        } else
        {
            if (Math.random() > 0.5)//概率,随机在根节点的左孩子和右孩子之间选择插入
            {
                if (node.leftChild == null)
                {
                    node.leftChild = new TreeNode<T>(data);
                } else
                {
                    buildBinaryTree(node.leftChild, data);
                }
            } else
            {
                if (node.rightChild == null)
                {
                    node.rightChild = new TreeNode<T>(data);
                } else
                {
                    buildBinaryTree(node.rightChild, data);
                }
            }
        }
    }

    /**
     * 访问当前节点
     *
     * @param current
     */
    public void getCurrentNode(TreeNode<T> current)
    {
        if (current != null && current.getData() != null)
        {
            System.out.println(current.getData());
        } else
        {
            System.out.println("null");
        }
    }

    /**
     * 前序遍历
     */
    public void preErgodic(TreeNode<T> root)
    {
        getCurrentNode(root);
        preErgodic(root.leftChild);
        preErgodic(root.rightChild);
    }
}
