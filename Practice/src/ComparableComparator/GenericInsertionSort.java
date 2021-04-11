//package ComparableComparator;
//
//import java.lang.Comparable;
//
//public class GenericInsertionSort<T extends Comparable<T>>
//{
//    T [] ar;
//
//    public GenericInsertionSort(T[] ar)
//    {
//        this.ar = ar;
//    }
//
//    public void sort()
//    {
//        for (int i = 1; i < ar.length; i++)
//        {
//            int j = i - 1;
//            T current = ar[i];
//
//            while (j >= 0 && ar[j]compareTo(current) > 0)
//            {
//                ar[j+1] = ar[j];
//                j--;
//            }
//            ar[j+1] = current;
//        }
//    }
//
//    @Override
//    public int compareTo(T t1)
//    {
//        if ()
//    }
//}
