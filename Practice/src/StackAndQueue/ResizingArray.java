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
        if (size == ar.length && size > 0)
        {
            ar = resize(2 * ar.length);
        }
        t = ar[size - 1];
        size++;
    }

    private T[] resize(int n)
    {
        T[] temp = (T[]) new Object[n];
        return temp;
    }


    public T pop()
    {
        T val = ar[size-1];
        size--;
        if (size == ar.length/4)
        {
            resize(ar.length/2);
        }
        return val;
    }

    public static void main(String[] args)
    {
        ResizingArray<Integer> array = new ResizingArray<Integer>();
        array.push(7);
        array.push(8);
        array.push(6);
        array.push(9);
        array.push(9);
        array.push(4);
        array.push(8);
        array.push(4);
        array.push(7);
        array.push(4);
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        array.push(19);
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
    }


}
