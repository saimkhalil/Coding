package Collections;

public class ThePCycle
{
    public Node creatingP(Node start)
    {
        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();
        int n = saimsLinkedList.getSize(start);

        Node temp1 = start;
        Node temp2 = start;

        for (int i = 0; i < n/2; i++)
        {
            temp1 = temp1.next;
        }

        while (temp2.next != null)
        {
            temp2 = temp2.next;
        }

        temp2.next = temp1;

        return start;
    }

    public int findingPoint(Node start)
    {
//        Node temp1 = start;
//        Node temp2 = temp1.next;
//
//        for (int i = 0; i < Integer.MAX_VALUE; i++)
//        {
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }

        Node temp1 = start;
        Node temp2 = temp1.next;
        int count = 0;

        while (temp2 != temp1)
        {
            count++;
            temp2 = temp2.next;

            if (count == 2)
            {
                temp1= temp1.next;
                count = 0;
            }
        }
//        temp2= temp2.next;
//        temp1.next = null;
        int circleLength = 1;
        Node temp3 = temp2;
        temp1 = temp1.next;
        while (temp1 != temp3)
        {
            circleLength++;
            temp1 = temp1.next;
        }

        return Intersection.intersect(start,temp2);
    }

    public static void main(String[] args)
    {
      Node start = SaimsLinkedList.getRandomLinkedList();
        SaimsLinkedList.display1(start);
      ThePCycle thePCycle = new ThePCycle();
      Node head1 = thePCycle.creatingP(start);
        System.out.println(thePCycle.findingPoint(head1));
    }
}
