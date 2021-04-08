package Collections;

public class GenericLinkedList<Item>
{

    public static class Node<Item>
    {
        public Item data;
        public Node<Item> next;

        public Node(Item data) {
            this.data = data;
        }
    }

    private Node<Item> head;

    public Node<Item> getHead() {
        return head;
    }

    private int size = 0;


    public boolean isEmpty()
    {
        return size == 0;
    }

    public void add(Item data)
    {
        Node<Item> toAdd = new Node<Item>(data);

        if (head == null)
        {
            head = toAdd;
            return;
        }

        Node<Item> temp = head;

        //this is called traversing a linked list
        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = toAdd;
        this.size++;
    }

    public Item remove() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List Empty");

        Node<Item> temp = head;

        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        Item item = temp.next.data;
        temp.next = null;
        this.size--;
        return item;
    }

    public int size()
    {
        return this.size;
    }
}