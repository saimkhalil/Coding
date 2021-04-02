package Collections;

public class LinkListDemo
{
    public static void demo()
    {
        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();

        for (int i = 1; i < 10 ; i++) {
            saimsLinkedList.add(i + 1);
        }

        System.out.println("Displaying....");

        saimsLinkedList.display();
    }

    public static void main(String[] args)
    {
        LinkListDemo.demo();
    }

}
