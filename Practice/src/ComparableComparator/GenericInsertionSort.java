package ComparableComparator;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.List;

public class GenericInsertionSort<T extends Comparable<T>>
{
    List<T> ar;

    public GenericInsertionSort(List<T> ar)
    {
        this.ar = ar;
    }

    public void sort()
    {
        for (int i = 1; i < ar.size(); i++)
        {
            int j = i - 1;
            T current = ar.get(i);

            while (j >= 0 && ar.get(j).compareTo(current) > 0)
            {
                ar.set(j + 1, ar.get(j));
                j--;
            }
            ar.set(j+1, current);
        }
    }

    public void display()
    {
        for (T t : ar)
        {
            System.out.print(t + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(2, 4, 6, 7, 3, 0);

        List<String> names = Arrays.asList("Saim", "Fuzail", "Insha", "Saaim", "Siam");
        GenericInsertionSort<String> obj = new GenericInsertionSort<>(names);

        obj.display();
        obj.sort();
        obj.display();
    }
}
