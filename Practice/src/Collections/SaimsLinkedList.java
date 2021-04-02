package Collections;


import java.util.Random;

public class SaimsLinkedList
{
     Node head;
     int count = 0;


    public boolean isEmpty()
     {
         if (head == null)
             return true;
         else
             return false;
     }

     public void add(int data)
     {
         Node toAdd = new Node(data);

         if (head == null)
         {
             head = toAdd;
             return;
         }

         Node temp = head;

         //this is called traversing a linked list
         while (temp.next != null)
         {
             temp = temp.next;
         }

         temp.next = toAdd;
         this.count++;
     }

     public void remove(int val)
     {
         if (isEmpty())
             System.out.println("it is Empty");

         else
         {
             Node temp = head;

             while (temp.next.data != val)
             {
                 temp = temp.next;
             }

             Node t = temp.next;
             temp.next = t.next;
             t = null;
             this.count--;
         }
     }

     public boolean isPresent(int val)
     {
         if (isEmpty())
             return false;

         else
         {
             Node temp = head;

             while (temp.next != null)
             {
                 if (temp.data == val)
                     return true;
                 temp = temp.next;
             }
             return false;
         }
     }

     public int size()
     {
         return this.count;
     }

     public void display()
     {
         Node temp = head;
         while (temp != null)
         {
             System.out.println(temp.data);
             temp = temp.next;
         }
     }

    public static Node getRandomLinkedList()
    {
        SaimsLinkedList saimsLinkedList = new SaimsLinkedList();
        Random random = new Random();
        int n = random.nextInt(15);
        while (n < 3)
        {
            n = random.nextInt(15);
        }

        for (int i = 1; i < n; i++)
        {
            saimsLinkedList.add(random.nextInt(99));
        }

        return  saimsLinkedList.head;
    }

}
