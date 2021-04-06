package Collections;

 interface Stack<T>
{
    void push(T t);

    T pop();

    boolean isEmpty();

    int size();

    T peek();

    void display();
}
