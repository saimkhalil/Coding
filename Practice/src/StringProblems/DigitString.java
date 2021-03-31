package StringProblems;

import java.util.Scanner;

public class DigitString
{


    public boolean checkDigit(String s)
    {
        int length = s.length();
        char ch;
        for (int i = 0; i < length; i++)
        {
            ch = s.charAt(i);
            if (ch < 48 || ch > 57)
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        DigitString s = new DigitString();
        System.out.println(s.checkDigit(a));
    }

}
