package StringProblems;

import java.util.Scanner;

public class CheckAnagram
{
    private Scanner sc;
    private int freq[];

    public CheckAnagram()
    {
        sc = new Scanner(System.in);
        freq = new int[123];
    }

    public boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;

        int index;
        int length = s1.length();
        char ch;
        for (int i = 0; i < length; i++)
        {
            ch = s1.charAt(i);
            index = ch;
            freq[index]++;
        }

        length = s2.length();

        for (int i = 0; i < length; i++)
        {
            ch = s2.charAt(i);
            index = (char) ch;
            freq[index]--;
        }

        for (int i = 0; i < 123; i++)
        {
            if (freq[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text for the first string");
        String a = sc.nextLine();
        System.out.println("Enter the text for the second string");
        String b = sc.nextLine();

        CheckAnagram s = new CheckAnagram();
        System.out.println(s.isAnagram(a, b));
    }
}
