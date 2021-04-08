package StackAndQueue;

public class QueueWithStackImpl<T> implements Queue<T>
{
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueWithStackImpl()
    {
        stack1 = new StackImpl<T>();
        stack2 = new StackImpl<T>();
    }

    @Override
    public void enqueue(T t)
    {
     stack1.push(t);
    }

    @Override
    public T dequeue()
    {
        if (stack1.size() == 0)
        {
            return null;
        }

        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }

        T temp = stack2.pop();

        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }

        return temp;
    }

    @Override
    public boolean isEmpty()
    {
        return (stack1.isEmpty());
    }

    public static void main(String[] args)
    {
//        Queue<Integer> queue = new QueueWithStackImpl<>();
//        System.out.println(queue.isEmpty());//true
//        queue.enqueue(7);
//        queue.enqueue(8);
//        queue.enqueue(6);
//        System.out.println(queue.dequeue());//7
//        queue.enqueue(9);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        System.out.println(queue.dequeue());//8
//        System.out.println(queue.dequeue());//6
//        System.out.println(queue.dequeue());//9
//        System.out.println(queue.dequeue());//2
//        System.out.println(queue.isEmpty());//false
//        System.out.println(queue.dequeue());//3
//        System.out.println(queue.isEmpty());//true

        Queue<String> queue = new QueueWithStackImpl<>();
        System.out.println(queue.isEmpty());//true
        queue.enqueue("saim");
        queue.enqueue("is");
        queue.enqueue("the");
        System.out.println(queue.dequeue());//7
        queue.enqueue("best");
        queue.enqueue("in");
        queue.enqueue("the");

        System.out.println(queue.dequeue());//8
        System.out.println(queue.dequeue());//6
        System.out.println(queue.dequeue());//9
        System.out.println(queue.dequeue());//2
        System.out.println(queue.isEmpty());//false
        System.out.println(queue.dequeue());//3
        System.out.println(queue.isEmpty());//true
    }
}
