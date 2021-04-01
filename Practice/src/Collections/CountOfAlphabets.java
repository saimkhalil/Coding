package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfAlphabets
{
    public void counting(String s)
    {
        char ch;
        HashMap<Character,Integer> h = new HashMap<>();

        int j = 1;
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            ch = s.charAt(i);

            if (h.containsKey(ch))
                h.put(ch, h.get(ch) + 1);
            else
                h.put(ch, j);
        }

        System.out.print(h.entrySet());
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        CountOfAlphabets q = new CountOfAlphabets();
        q.counting(s);
    }
}
