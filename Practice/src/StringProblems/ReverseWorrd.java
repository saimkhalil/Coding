package StringProblems;

import java.util.Scanner;

public class ReverseWorrd
{
    public String workString(String s)
    {
        String[] word = s.split(" ");
        int length = word.length;
        int j = length - 1;
        StringBuilder b = new StringBuilder();

        for (int i = j; i >= 0; i--)
        {
            if (!word[i].isEmpty())
            b.append(word[i] + " ");
        }
        String s2 = b.toString();
        return s2;


    }


    public static void main(String[] args)
    {
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ReverseWorrd q = new ReverseWorrd();
        System.out.println(q.workString(s));
    }
}
