package ArrayProblems;

import PriorityQueue.SortNames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MostOccurringWords
{
    private List<String> ar;
    private int k;

    public MostOccurringWords(List<String> ar)
    {
        this.ar = ar;
        this.ar.add(null);
        k = 1;
    }

    public void add(String key)
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
                String ex = ar.get(ind);
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

    public String pop()
    {
        String ex = ar.get(1);
        ar.set(1,ar.get(k-1));
        ar.set(k-1,ex);
        String max = ar.remove(k-1);
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
                String ex = ar.get(ind);
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
        List<String> list = new ArrayList<>();
        MostOccurringWords words = new MostOccurringWords(list);

        words.add("saim");
        words.add("saim");
        words.add("saim");
        words.add("insha");
        words.add("fuzail");
        words.add("fuzail");
        words.add("saim");
        words.add("saim");
        words.add("ausaf");
        words.add("insha");
        words.add("nawaz");
        words.add("shayan");
        words.add("fuzail");
        words.add("fuzail");
        words.add("saim");

        words.display();
        System.out.println();

        HashMap<String,Integer> names = new HashMap<String,Integer>();

        String demo = "lol";
        int count = 0;
        for (int i = 0; i < 15; i++)
        {
            String temp = words.pop();
            if (temp.equals(demo))
            {
                count++;
            }

            else
                {
                    if (!demo.equals("lol"))
                    names.put(demo,count);
                demo = temp;
                count = 0;
                count++;
            }
        }
        names.put(demo,count);
        System.out.print(names.entrySet());

    }

}
