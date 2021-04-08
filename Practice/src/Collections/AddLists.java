package Collections;

public class AddLists
{
    Node current;

    public Node sum(Node t1, Node t2)
    {
        int s1 = size(t1);
        int s2 = size(t2);
        current = new Node(-2); // dummy
        Node result = current;

        if (s2 > s1)
        {
            for (int i = 0; i < s2-s1; i++)
            {
                current.next = new Node(t2.data);
                current = current.next;
                t2 = t2.next;
            }
        }

        if (s1 > s2)
        {
            for (int i = 0; i < s1-s2; i++)
            {
                current.next = new Node(t1.data);
                current = current.next;
                t1 = t1.next;
            }
        }
        while (t1 != null && t2 != null)
        {
            int p = t1.data + t2.data;
            current.next = new Node(p);
            current = current.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        current = result.next;
        fix(current);
        current = result.next;
        fix(current);

        return result.next;
    }

    private void fix(Node current)
    {
        while (current.next != null)
        {
            current.data = current.data + (current.next.data /10);
            current.next.data = current.next.data % 10;
            current = current.next;
        }
    }


    private int size(Node t)
    {
        if (t == null)
        {
            return 0;
        }
        int size = 0;
        while (t != null)
        {
            size++;
            t = t.next;
        }
        return size;
    }

    public static void main(String[] args)
    {
        int ar1[] = {1, 9, 0, 9, 9};
        Node t1 = AddLinkedLists.convert(ar1);
        int ar2[] = {3,9, 7, 8};
        Node t2 = AddLinkedLists.convert(ar2);

        AddLists addLists = new AddLists();
        Node headSum = addLists.sum(t1,t2);

        System.out.println(AddLinkedLists.toString(headSum));
    }

}
