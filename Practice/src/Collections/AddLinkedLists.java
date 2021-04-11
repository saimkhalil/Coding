package Collections;

public class AddLinkedLists
{
    public Node sum(Node t1, Node t2)
    {
        int carry = 0;
        Node current = new Node(-1);
        Node result = current;

        while (t1 != null || t2 != null)
        {
            int a = (t1 == null) ? 0 : t1.data;
            int b = (t2 == null) ? 0 : t2.data;

            int digit = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;

            current.next = new Node(digit);
            current = current.next;

            if (t1 != null)
            {
                t1 = t1.next;
            }

            if (t2 != null)
            {
                t2 = t2.next;
            }
        }

        return result.next;
    }
//    public Node getSum(Node t1, Node t2)
//    {
//        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();
//
//        int count = 0;
//
//
//        while (t1.next != null && t2.next != null)
//        {
//            int p = t1.data + t2.data + count;
//            count = 0;
//
//            if (p > 9)
//            {
//                p = p % 10;
//                count++;
//            }
//
//            saimsLinkedList.add(p);
//
//            t1 = t1.next;
//            t2 = t2.next;
//        }
//
//        int p = t1.data + t2.data + count;
//        count = 0;
//        if (p > 9)
//        {
//            p = p % 10;
//            count++;
//        }
//
//        saimsLinkedList.add(p);
//
//        if (t1.next == null && t2.next != null)
//        {
//            while (t2.next != null)
//            {
//                if (count == 0)
//                saimsLinkedList.add(t2.data );
//
//                else
//                    saimsLinkedList.add(t2.data + count);
//
//                t2 = t2.next;
//            }
//        }
//
//        if (t2.next == null && t1.next != null)
//        {
//            while (t1.next != null)
//            {
//                if (count == 0)
//                saimsLinkedList.add(t1.data );
//
//                else
//                    saimsLinkedList.add(t1.data + count);
//
//                t1 = t1.next;
//            }
//        }
//
//        return saimsLinkedList.head;
//    }

    public static void main(String[] args)
    {
//        Node n1 = new Node(-1); // dummy
//        n1.next = new Node(5);
//        n1 = n1.next;
//        n1.next = new Node(4);

        int ar1[] = {1, 2, 3, 4, 5};
        Node t1 = convert(ar1);
        int ar2[] = {9, 7, 8};
        Node t2 = convert(ar2);

        AddLinkedLists addLinkedLists = new AddLinkedLists();

        Node headSum = addLinkedLists.sum(t1,t2);

        System.out.println(toString(headSum));

    }

    public static Node convert(int ar[])
    {
        Node n = new Node(-1);
        Node temp = n;

        for (int i = 0; i < ar.length; i++)
        {
            temp.next = new Node(ar[i]);
            temp = temp.next;
        }
        return n.next;
    }

    public static String toString(Node head)
    {
        StringBuilder sb = new StringBuilder();

        while (head != null)
        {
            sb.append(head.data);
            sb.append(" --> ");
            head = head.next;
        }

        sb.append("null");

        return sb.toString();
    }


}
