package Collections;

//provided linked list is 3 6 -9 12 -15 20 -30

import java.util.Scanner;

public class SortLinkedList
{
    private Scanner sc = new Scanner(System.in);

    public Node creatingLinkedList()
    {
        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();

        System.out.println("Enter the Values");

        for (int i = 0; i < 7; i++)
        {
            saimsLinkedList.add(sc.nextInt());
        }

        return saimsLinkedList.head;

    }

    public Node toSort(Node head)
    {
        Node temp1 = head.next;
        Node temp2 = temp1.next;

        while (temp2.next != null)
        {
            if (temp2.data < 0)
            {
                temp1.next = temp2.next;
                temp2.next = head;
                head = temp2;
                temp2 = temp1.next;

            }
            else
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        if (temp2.data < 0) {
            temp2.next = head;
            head = temp2;
            temp1.next = null;
        }
        return head;
    }

    public static void main(String[] args)
    {
        SortLinkedList sortLinkedList = new SortLinkedList();
        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();
        Node head1 = sortLinkedList.creatingLinkedList();
        saimsLinkedList.display1(head1);
        Node sortedHead = sortLinkedList.toSort(head1);
        saimsLinkedList.display1(sortedHead);
    }



}
