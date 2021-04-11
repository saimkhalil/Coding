package PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class SortNames 
{
    private List<String> ar;
    private int k;

    public SortNames(List<String> ar)
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

            if(compare(ar.get(ind/2),ar.get(ind)) < 0) //(ar.get(ind/2).compareTo(ar.get(ind)) < 0)
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
        String  ex = ar.get(1);
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
                if(compare(ar.get(j),ar.get(j+1)) < 0) //(ar.get(j).compareTo(ar.get(j + 1)) < 0)
                {
                    j = j + 1;
                }
            }

            if(compare(ar.get(ind),ar.get(j)) < 0) //(ar.get(ind).compareTo(ar.get(j)) < 0)
            {
                String ex = ar.get(ind);
                ar.set(ind,ar.get(j));
                ar.set(j,ex);
                ind = j;
            }
            ind = j;

        }
    }
    
    private int compare(String s1, String s2)
    {
        if (s1.length() > s2.length())
        {
            for (int i = 0; i < s2.length(); i++) 
            {
                int ss1 = s1.charAt(i);
                int ss2 = s2.charAt(i);
                
                if (ss1 > ss2)
                {
                    return 1;
                }
                else if (ss1 < ss2)
                {
                    return -1;
                }
            }
            return 1;
        }
        else if (s1.length() < s2.length())
        {
            for (int i = 0; i < s1.length(); i++) 
            {
                int ss1 = s1.charAt(i);
                int ss2 = s2.charAt(i);

                if (ss1 > ss2) 
                {
                    return 1;
                } 
                else if (ss1 < ss2) 
                {
                    return -1;
                }
            }
            return -1;
        }
        else 
        {
            for (int i = 0; i < s1.length(); i++)
            {
                int ss1 = s1.charAt(i);
                int ss2 = s2.charAt(i);

                if (ss1 > ss2)
                {
                    return 1;
                }
                else if (ss1 < ss2)
                {
                    return -1;
                }
            }
            return 0;
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
        SortNames sortNames = new SortNames(list);

        sortNames.add("saim");
        sortNames.add("saaim");
        sortNames.add("siaam");
        sortNames.add("insha");
        sortNames.add("fuuzail");
        sortNames.add("fuzail");

        sortNames.display();
        System.out.println();

        String[] ar = new String[6];
        for (int i = 5; i >= 0; i--)
        {
            ar[i] = sortNames.pop();
        }

        for (int i = 0; i < 6; i++)
        {
            System.out.print(ar[i] + "\t");
        }   
    }
}
