package ArrayProblems;

import java.util.Scanner;

public class PrintDuplicate
{
    private Scanner sc;
    private String s;
    private int freq[];

    public PrintDuplicate(String a)
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


        char ch2;
        int count;
        for (int i = 0; i < 123; i++)
        {
            if (freq[i] > 1)
            {
                ch2 = (char) i;
                count = freq[i];
                System.out.println(ch2 + " has " +count +  " duplicates present in the text you have provided");
            }
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        PrintDuplicate s = new PrintDuplicate(a);
        s.getFrequency();
    }

}
