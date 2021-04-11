package ComparableComparator;

import java.util.Comparator;

public class SortByName implements Comparator<Simpsons>
{
        @Override
        public int compare(Simpsons o1, Simpsons o2)
        {
            return o1.name.compareTo(o2.name);
        }
}
