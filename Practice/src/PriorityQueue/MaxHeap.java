package PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap
{
    List<Integer> list;

    public MaxHeap(List<Integer> list)
    {
        this.list = list;
    }

    public void createMaxHeap()
    {
        int length = list.size();

        for (int i = 0; i < list.size(); i++)
        {
            sink(list.size(),length-1);
            length = length - 1;
        }
    }

    private void swim(int length, int ind)
    {
        while (ind >= 1 && ind < length)
        {
            if (list.get(ind/2) < list.get(ind))
            {
                int ex = list.get(ind);
                list.set(ind,list.get(ind/2));
                list.set(ind/2,ex);
                ind = ind /2;
            }
        }
    }

    private void sink(int length, int ind)
    {
        while (2*ind < length)
        {
            int j = 2 * ind;

            if (list.get(j) < list.get(j + 1))
            {
                j = j + 1;
            }

            if (list.get(ind) < list.get(j))
            {
                int ex = list.get(ind);
                list.set(ind,list.get(j));
                list.set(j,ex);
                ind = j;
            }
            ind = j;

        }
    }

    public void add(int key)
    {
        list.add(key);
        int length = list.size();
        swim(length,length-1);

    }

    public int pop()
    {
        int length = list.size();
        int ex = list.get(0);
        list.set(0,list.get(length-1));
        list.set(length-1,ex);
        int max = list.remove(length-1);
        sink(list.size(),0);
        return max;
    }
            //7 ,14 ,9 ,6 ,3 ,11 ,17 ,9 ,6 ,19
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(14);
        list.add(9);
        list.add(6);
        list.add(3);
        list.add(11);
        list.add(17);
        list.add(9);
        list.add(6);
        list.add(19);
        MaxHeap insertDelete = new MaxHeap(list);
        insertDelete.createMaxHeap();

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        insertDelete.add(21);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        System.out.println(insertDelete.pop());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + "\t");
        }

//        insertDelete.add(29);
//        insertDelete.add(45);
////        insertDelete.insert(2);
////        insertDelete.insert(0);
//
//        System.out.println(insertDelete.pop());
//        System.out.println(insertDelete.pop());
//        insertDelete.add(23);
//
//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.print(list.get(i) + "\t");
//        }
    }
}
