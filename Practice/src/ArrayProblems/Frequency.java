package ArrayProblems;

import java.util.Scanner;

public class Frequency
{
    private Scanner sc;
    private String s;
    private int freq[];

    public Frequency(String a)
    {
        sc = new Scanner(System.in);
        s = a;
        freq = new int[123];
    }

    public void getFrequency()
    {
        int index;
        int end = s.length();
        char ch;
        for (int i = 0; i < end; i++)
        {
            ch = s.charAt(i);
            index = ch;
            freq[index]++;
        }

        int max = Integer.MIN_VALUE;

        int n = 0;
        for (int i = 0; i < 123; i++)
        {
            if (freq[i] > max)
            {
                max = freq[i];
                n = i;
            }
        }
        char ch2 = (char) n;
        System.out.println(ch2 + " is the most frequent letter in " + s);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Frequency s = new Frequency(a);
        s.getFrequency();
    }


}
