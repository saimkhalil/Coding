package StackAndQueue;

public class StackImplQueue<T> implements Stack<T>
{
    private TNode<T> front;
    private TNode<T> rear;
    private int size;

    public StackImplQueue()
    {
        size = 0;
    }

    @Override
    public void push(T t)
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
    public T pop()
    {
        TNode<T> temp = rear.next;
        rear.next = null;
        T val = rear.val;
        rear = temp;
        size--;
        return val;
    }

    @Override
    public boolean isEmpty()
    {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() //returns the front most value
    {
        return front.val;
    }

    @Override
    public void display()
    {
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Stack<Integer> queue = new StackImplQueue<>();
        System.out.println(queue.isEmpty());
        queue.push(7);
        queue.push(1);
        System.out.println(queue.isEmpty());
        queue.push(6);
        queue.push(9);
        System.out.println(queue.pop());// pops out 7
        System.out.println(queue.pop());// pops 1
        System.out.println(queue.peek());//9
        queue.push(4);
        System.out.println(queue.peek());//4
        System.out.println(queue.pop());//6
        System.out.println(queue.pop());//9
        System.out.println(queue.pop());//4
        System.out.println(queue.isEmpty());//true


    }
}
