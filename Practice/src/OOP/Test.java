package OOP;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws Exception {
        Container<Integer> myContainer = new Container<>();
        for (int i = 0; i < 10 ; i++)
        {
            myContainer.addToContainer(i + 1);
        }


//        Iterator<Integer> containerIterator1 = myContainer.iterator();
//
//        while (containerIterator1.hasNext())
//        {
//            System.out.print(containerIterator1.next() + "\t");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 5 ; i++)
//        {
//            if (!myContainer.isContainerEmpty())
//            {
//                int val = myContainer.removeFromContainer();
//                System.out.println(val);
//            }
//        }
//
//        System.out.println();
//
//        Iterator<Integer> containerIterator2 = myContainer.iterator();
//
//        while (containerIterator2.hasNext())
//        {
//            System.out.print(containerIterator2.next() + "\t");
//        }
//
//        System.out.println();

        List<Integer> myList = Arrays.asList(5, 2, 2, 4, 7);

        for (Integer i : myList)
        {
            System.out.print(i + "\t");
        }




        System.out.println();

        for (Integer i : myContainer)
        {
            System.out.print(i + "\t");

        }
        System.out.println();

        for (Integer i : myContainer)
        {
            System.out.print(i + "\t");

        }
        System.out.println();
        for (Integer i : myContainer)
        {
            System.out.print(i + "\t");

        }
        System.out.println();
        for (Integer i : myContainer)
        {
            System.out.print(i + "\t");

        }
        System.out.println();
        for (Integer i : myContainer)
        {
            System.out.print(i + "\t");

        }
    }
}
