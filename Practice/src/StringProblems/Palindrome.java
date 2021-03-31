package StringProblems;

import java.util.Scanner;

public class Palindrome
{
    public boolean isPalindrome(String s)
    {
        int length = s.length();
        int j = length - 1;

        for (int i = 0; i < length; i++)
        {
            if (s.charAt(i) != s.charAt(j))
                return false;

            else
            {
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        Palindrome s = new Palindrome();
        System.out.println(s.isPalindrome(a));
    }
}
