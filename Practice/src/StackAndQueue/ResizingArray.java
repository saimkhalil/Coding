package StackAndQueue;

public class ResizingArray<T>
{
    // T[] ar = (T[]) new Object[12];
    private T[] ar;
    private int size;

    public ResizingArray()
    {
        ar = (T[])  new Object[1];
        size = 1;
    }


    public void push(T t)
    {
        if (size == ar.length-1 && size > 0)
        {
            ar = resize(2 * ar.length);
        }
        t = ar[size++];
    }

    private T[] resize(int n)
    {
        T[] temp = (T[]) new Object[n];
        return temp;
    }


    public T pop()
    {
        T val = ar[size];
        size--;
        if (size == ar.length/4)
        {
            resize(ar.length/2);
        }
        return val;
    }


}
