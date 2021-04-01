package Collections;

import java.util.Scanner;

public class DisplayVowels
{
    public void checkVowels(String str)
    {

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if ("AEIOUaeiou".contains(ch + ""))
            {
                System.out.print(ch);
            }
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Enter the sentence ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        DisplayVowels d = new DisplayVowels();
        d.checkVowels(s);
    }
}
