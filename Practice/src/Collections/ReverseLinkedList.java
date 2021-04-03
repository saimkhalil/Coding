package Collections;

public class ReverseLinkedList
{
    private Node revStart;

    public void reverseList(Node start)
    {
        Node temp = start;
        reverse(start);
        temp.next = null;

    }

    private void reverse(Node start)
    {
       //write your code here.
        if (start.next == null)
        {
            revStart = start;
            return;
        }

        reverse(start.next);
        start.next.next = start;
    }


    public Node reversee(Node start)
    {
        Node start1 = start;
        Node t1 = start;
        Node t2 = t1.next;

        while (t2.next != null)
        {
            t1 = t2;
            t2 = t2.next;
            t1.next = start1;
            start1 = t1;

        }
        t2.next = t1;
        start.next = null;

        return (t2);


    }

    public void display(Node start)
    {
        Node temp = start;
        while (temp != null)
        {
            System.out.print(temp.data +"\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node start = SaimsLinkedList.getRandomLinkedList();
        System.out.println("Before Reversing...");
        reverseLinkedList.display(start);
        System.out.println("After reversing...");
        reverseLinkedList.display(reverseLinkedList.reversee(start));
//        reverseLinkedList.reverseList(start);
//        reverseLinkedList.display(reverseLinkedList.revStart);

    }

}
