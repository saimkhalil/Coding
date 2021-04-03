package Collections;

public class MiddleLinkedList
{
    public int findMiddle(Node start)
    {
        Node slow = start;
        Node fast = start;

        while (fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
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
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();
        Node start = SaimsLinkedList.getRandomLinkedList();
        System.out.println("Our Linked list");
        middleLinkedList.display(start);
        System.out.println(middleLinkedList.findMiddle(start));
    }
}
