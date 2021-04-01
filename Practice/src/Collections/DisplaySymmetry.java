package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DisplaySymmetry
{
    public void findSymmetricPair(List<List<Integer>>ar)
    {
        HashMap<Integer,Integer> h = new HashMap<>();

        for (int i = 0; i < ar.size(); i++)
        {
            h.put(ar.get(i).get(0),ar.get(i).get(1));
        }

        for (int i = 0; i < ar.size(); i++)
        {
            if (h.containsKey(h.get(ar.get(i).get(0))) && h.get(h.get(ar.get(i).get(0))) == ar.get(i).get(0))
            {
                if (ar.get(i).get(0) < h.get(ar.get(i).get(0)))
                System.out.println(i + "," + ar.get(i));

            }
        }
    }

    public static void main(String[] args)
    {
        List<List<Integer>> ar = Arrays.asList(Arrays.asList(1,3), Arrays.asList(2,5), Arrays.asList(7,9), Arrays.asList(3, 1)
                ,Arrays.asList(5,2));

        DisplaySymmetry displaySymmetry= new DisplaySymmetry();
        displaySymmetry.findSymmetricPair(ar);
    }
}
