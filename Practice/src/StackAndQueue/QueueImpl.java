package StackAndQueue;

public class QueueImpl<T> implements Queue<T>
{
    private TNode<T> front;
    private TNode<T> rear;
    private int size;

    public QueueImpl()
    {
        size = 0;
    }

    @Override
    public void enqueue(T t)
    {

        if (size == 0)
        {
            front = new TNode<T>(t);
            rear = front;
            size++;
            return;
        }

        front.next = new TNode<T>(t);
        front = front.next;
        size++;
    }

    @Override
    public T dequeue()
    {
        if (size == 0)
        {
            return null;
        }

        TNode<T> temp = rear.next;
        rear.next = null;
        T val = rear.val;
        rear = temp;
        size--;
        return val;

    }


    public boolean isEmpty()
    {
        return (size == 0);
    }

    public static void main(String[] args)
    {
        Queue<Integer> queue = new QueueImpl<>();
        System.out.println(queue.isEmpty());
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
    }
}
