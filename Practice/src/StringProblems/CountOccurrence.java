package StringProblems;

import java.util.Scanner;

public class CountOccurrence
{
    public int checkOccurrence(String s, char a)
    {
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
             if (s.charAt(i) == a )
             {
                 count++;
             }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the character whose count you want to have");
        char a = sc.next().charAt(0);

        CountOccurrence m = new CountOccurrence();
        System.out.println(m.checkOccurrence(s,a));
    }

}
