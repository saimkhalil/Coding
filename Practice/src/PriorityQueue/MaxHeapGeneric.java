package PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class MaxHeapGeneric<T extends Comparable<T>>
{
    private List<T> ar;
    private int k;

    public MaxHeapGeneric(List<T> ar) 
    {
        this.ar = ar;
        this.ar.add(null);
        k = 1;
    }
    
    public void add(T key)
    {
        if (ar.size() == 1)
        {
            ar.add(key);
            k++;
        }
        
        else
        {
            ar.add(key);
            swim(k);
            k++;
        }
    }

    private void swim(int ind)
    {
        while (ind > 1)
        {

            if (ar.get(ind/2).compareTo(ar.get(ind)) < 0)
            {
                T ex = ar.get(ind);
                ar.set(ind,ar.get(ind/2));
                ar.set(ind/2,ex);
                ind = ind /2;
            }
            else
            {
                return;
            }
        }
    }

    public T pop()
    {
        T ex = ar.get(1);
        ar.set(1,ar.get(k-1));
        ar.set(k-1,ex);
        T max = ar.remove(k-1);
        k--;
        sink(1);
        return max;
    }

    private void sink(int ind)
    {
        while (2*ind < k)
        {
            int j = 2 * ind;

            if (j + 1 < k)
            {
                if (ar.get(j).compareTo(ar.get(j + 1)) < 0)
                {
                    j = j + 1;
                }
            }

            if (ar.get(ind).compareTo(ar.get(j)) < 0)
            {
                T ex = ar.get(ind);
                ar.set(ind,ar.get(j));
                ar.set(j,ex);
                ind = j;
            }
            ind = j;

        }
    }
    
    public void display()
    {
//        for (T t : ar)
//        {
//            System.out.print(t + "\t");
//        }   to ask how to change the limit in enhanced for loop
        for (int i = 1; i < k; i++)
        {
            System.out.print(ar.get(i) + "\t");
        }
    }

    public static void main(String[] args) 
    {
//        List<Integer> list1 = new ArrayList<>();
//        MaxHeapGeneric<Integer> maxHeapGeneric = new MaxHeapGeneric<Integer>(list1);
//
//        maxHeapGeneric.add(23);//
//        maxHeapGeneric.add(13);//
//        maxHeapGeneric.add(29);
//        maxHeapGeneric.add(0);//
//        maxHeapGeneric.add(36);//
//        maxHeapGeneric.add(11);//
//        maxHeapGeneric.add(48);//
//        maxHeapGeneric.add(6);//
//        maxHeapGeneric.add(16);//
//        maxHeapGeneric.add(36);//
//        maxHeapGeneric.add(44);//
//        maxHeapGeneric.display();
//        System.out.println();
//
//        System.out.println(maxHeapGeneric.pop());
//
//        System.out.println(maxHeapGeneric.pop());
//
//        maxHeapGeneric.display();

//    ans 1 List<String> list = new ArrayList<>();
//          MaxHeapGeneric<String> maxHeapGeneric = new MaxHeapGeneric<>(list);
//
//          maxHeapGeneric.add("saim");
//          maxHeapGeneric.add("saaim");
//          maxHeapGeneric.add("siaam");
//          maxHeapGeneric.add("insha");
//          maxHeapGeneric.add("fuuzail");
//          maxHeapGeneric.add("fuzail");
//
//          maxHeapGeneric.display();
//          System.out.println();
//
//          String[] ar = new String[6];
//          for (int i = 5; i >= 0; i--)
//          {
//                ar[i] = maxHeapGeneric.pop();
//          }
//
//          for (int i = 0; i < 6; i++)
//          {
//              System.out.print(ar[i] + "\t");
//          }
//




    }
}
