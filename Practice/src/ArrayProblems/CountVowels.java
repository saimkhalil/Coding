package ArrayProblems;

import java.util.Scanner;

public class CountVowels
{
    public void getVowels(String s)
    {
        int m = 0;
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            char ch = s.charAt(i);
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
//            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' )
            if ("AEIOUaeiou".contains(ch + ""))
            {
                m++;
            }
        }
        System.out.println("No of vowels " +m);
        System.out.println("no of consonants " + (s.length()-m));

    }

    public static void main(String[] args)
    {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        CountVowels s = new CountVowels();
        s.getVowels(a);
    }
}
