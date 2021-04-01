package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords
{
    public void frequency(String str)
    {
        String[] s = str.split(" ");

        HashMap<String,Integer> h = new HashMap<>();

        for (int i = 0; i < s.length; i++)
        {
            if (h.containsKey(s[i]))
                h.put(s[i],h.get(s[i]) + 1);
            else
                h.put(s[i],1);

        }
        System.out.println(h.entrySet());
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        CountWords q = new CountWords();
        q.frequency(str);


    }
}
