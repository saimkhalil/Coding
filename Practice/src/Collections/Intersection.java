package Collections;

import java.util.ArrayList;
import java.util.List;

public class Intersection
{
    public static int intersect(Node head1, Node head2)
    {
        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();
        int size1 = saimsLinkedList.getSize(head1);
        int size2 = saimsLinkedList.getSize(head2);

        Node temp1 = head1;
        Node temp2 = head2;

        if (size1 > size2)
        {
            int n = size1- size2;
            temp1 = equalize(temp1,n);
        }
        else
        {
            int n = size2 - size1;
            temp2 = equalize(temp2,n);
        }

        while (temp1 != temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1.data;

    }

    private static Node equalize(Node temp,int n)
    {
        for (int i = 0; i < n; i++)
        {
            temp = temp.next;

        }
        return temp;
    }

    private static List<Node> getLists()
    {
        Node start = SaimsLinkedList.getRandomLinkedList();
        SaimsLinkedList.display1(start);

        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(1);
        Node n5 = new Node(0);
        n1.next = n2;
        n2.next = n3;
        n3.next = start;

        n4.next = n5;
        n5.next = start;

        List<Node> heads = new ArrayList<>();
        heads.add(n1);
        heads.add(n4);
        return heads;
    }

    public static void main(String[] args)
    {
        List<Node> heads = Intersection.getLists();
        System.out.println(Intersection.intersect(heads.get(0), heads.get(1)));

    }
}
