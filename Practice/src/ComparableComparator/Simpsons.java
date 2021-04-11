package ComparableComparator;

import java.util.*;

public class Simpsons implements Comparable<Simpsons>
{
    String name;
    int marks;
    public Simpsons(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return ("[ marks= " + marks + ", name= " + name + "]");
    }

    @Override
    public int compareTo(Simpsons o)
    {
        //return this.name.compareTo(o.name);
        if (this.marks < o.marks) return 1;
        else if (this.marks > o.marks) return -1;
        else return 0;


    }



    public static void main(String[] args)
    {
        List<Simpsons> list = new ArrayList<>();

        list.add(new Simpsons("saim", 97));
        list.add(new Simpsons("is" , 93));
        list.add(new Simpsons("the", 91));
        list.add(new Simpsons("best", 88));

        Collections.sort(list);

        for (Simpsons k : list)
        {
            System.out.println(k.toString());
        }

        System.out.println("--------------------------->");

        Collections.sort(list, new SortByName());

        for (Simpsons k : list)
        {
            System.out.println(k.toString());
        }


    }


}

