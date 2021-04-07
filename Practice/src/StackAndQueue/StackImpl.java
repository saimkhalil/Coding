package StackAndQueue;

public class StackImpl<T> implements Stack<T>
{
    private TNode<T> top;
    private int size;

    public StackImpl()
    {
        this.size = 0;
    }

    @Override
    public void push(T t)
    {
        if (size == 0)
        {
            top = new TNode<T>(t);
            size++;
            return;
        }

        TNode<T> temp = top;
        top = new TNode<T>(t);
        top.next = temp;
        size++;
    }

    @Override
    public T pop()
    {
        if (isEmpty())
        {
            return null;
        }

        TNode<T> temp = top;
        T val = top.val;
        top = top.next;
        temp.next = null;
        size--;
        return val;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public T peek()
    {
        if (isEmpty())
            return null;

        return top.val;
    }

    public void display()
    {
        TNode temp = top;
        while (temp.next != null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new StackImpl<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}