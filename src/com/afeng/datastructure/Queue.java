package com.afeng.datastructure;

/**队列
 * @author afeng
 * @date 2018/9/25 10:57
 **/
public class Queue<E>
{
    private int head;//头指针
    private int tail;//尾指针

    private int max_size = 16;

    private Object[] data;


    public Queue()
    {
        this(10);
    }

    public Queue(int size)
    {
        if (size < 0)
        {
            throw new IllegalArgumentException("队列初始化失败,原因是:" + size + "小于0");
        }
        this.max_size = size;
        head = tail = 0;//头指针和尾指针是0
        data = new Object[max_size];
    }

    public static void main(String[] args)
    {
        Queue<String> stringQueue = new Queue<>();
        stringQueue.enQueue("a");
        stringQueue.enQueue("f");
        stringQueue.enQueue("e");
        stringQueue.enQueue("n");
        stringQueue.enQueue("g");
        while (!stringQueue.isEmpty())
        {
            System.out.println(stringQueue.deQueue());
        }
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return head == tail;
    }

    /**
     * 入队
     *
     * @param e
     * @return
     */
    public boolean enQueue(E e)
    {
        if (tail == max_size)
        {
            throw new RuntimeException("队列已满!");
        } else
        {
            data[tail++] = e;
            return true;
        }
    }

    /**
     * 返回队首元素
     *
     * @return
     */
    public E peek()
    {
        if (isEmpty())
        {
            return null;
        }
        return (E) data[head];
    }

    /**
     * 出队
     *
     * @return
     */
    public E deQueue()
    {
        if (isEmpty())
        {
            throw new RuntimeException("队列为空");
        } else
        {
            E e = (E) data[head];
            data[head++] = null;
            return e;
        }

    }

    /**
     * 队列的长度
     *
     * @return
     */
    public int length()
    {
        return tail - head;
    }
}
