package Collections;

public class StackImpl<T> implements Stack<T>
{
    private TNode<T> head;
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
            head = new TNode<T>(t);
            size++;
            return;
        }
        TNode<T> temp = head;
        head = new TNode<T>(t);
        head.next = temp;
        size++;
    }

    @Override
    public T pop()
    {
        if (size == 0)
        return null;
        TNode<T> temp = head;
        T val = head.val;
        head = head.next;
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
        if (size == 0)
        return null;
        return head.val;
    }
}
