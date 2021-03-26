package ArrayProblems;

import java.util.Scanner;

public class ReverseWord
{
    String[] str;
    String s;
    int n = 0;
    int m = 0;

    public ReverseWord(String s)
    {
        s = s;
        int length = s.length();
        str = new String[length];
    }
    public void reverse(String s)
    {
        int spaceIndex;
        int size = s.length();
        for (int i = 0; i < size; i++)
        {
            if (s.charAt(i) == ' ')
            {
                spaceIndex = i;
                storeString(spaceIndex,s);
            }
        }
        str[n] = s.substring(m);
    }

    public void storeString(int p, String s)
    {
        str[n] = s.substring(m,p);
        m = p + 1;
        n++;
    }

    public void displayReverse()
    {
        for (int i = n; i >= 0; i--)
        {
            System.out.print(str[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text which you want to reverse");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ReverseWord q = new ReverseWord(s);
        q.reverse(s);
        q.displayReverse();
    }
}
