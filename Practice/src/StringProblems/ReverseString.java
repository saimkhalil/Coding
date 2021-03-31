package StringProblems;

import java.util.Scanner;

public class ReverseString
{
    private Scanner sc;
    private StringBuilder s;

    public ReverseString(String a)
    {
        sc = new Scanner(System.in);
        s = new StringBuilder(a);
    }

    public void toReverse()
    {
        System.out.println(s.reverse());
    }

    public StringBuilder getReverse(String str)
    {
        int length = str.length();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < length ; i++)
        {
            rev.insert(0, str.charAt(i));
        }
        return rev;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text which you want to reverse");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ReverseString m = new ReverseString(a);
//        m.toReverse();
        System.out.println(m.getReverse(a));
    }

}
