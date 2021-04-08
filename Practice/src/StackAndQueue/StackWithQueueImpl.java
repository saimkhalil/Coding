package StackAndQueue;

public class StackWithQueueImpl<T> implements Stack<T>
{
    private Queue<T> q1;
    private Queue<T> q2;


    public StackWithQueueImpl()
    {
        q1 = new QueueImpl<T>();
        q2 = new QueueImpl<T>();
    }


    @Override
    public void push(T t)
    {
        q1.enqueue(t);

    }

    @Override
    public T pop()
    {
        T temp = null;

        while (!q1.isEmpty())
        {
            temp = q1.dequeue();
            if (!q1.isEmpty())
            {
                q2.enqueue(temp);
            }
        }

        while (!q2.isEmpty())
        {
            q1.enqueue(q2.dequeue());
        }
        return temp;
    }

    @Override
    public boolean isEmpty()
    {
        return (q1.isEmpty());
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public void display() {
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new StackWithQueueImpl<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
    }
}
