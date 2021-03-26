package ArrayProblems;

import java.util.Scanner;

public class ReverseWords
{
    private String[] str;
    int m;
    char ch[];

    public ReverseWords(String s)
    {
        str = new String[s.length()];
        m = 0;
        ch = s.toCharArray();
    }

    public void findWords(String s)
    {
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            if (s.charAt(i) == ' ')
            {
                int index = i;
                wordReverse(index);

            }

        }
        char q;
        int j = s.length() - 1;
        int count = 0;
        for (int k = m; k < s.length(); k++)
        {
            count++;
            q = ch[k];
            ch[k] = ch[j];
            ch[j] = q;
            j--;
            if ((s.length() - m) / 2  == count)
                break;
        }
    }

    public void wordReverse(int p)
    {
        char q;
        int j = p - 1;
        int count = 0;
        for (int i = m; i < p; i++)
        {
            count++;
            q = ch[i];
            ch[i] = ch[j];
            ch[j] = q;
            j--;
            if(count == (p - m) / 2 )
                break;
        }
        m = p + 1;
    }

    public void displayReverse()
    {
        String s1 = "";
        s1 = s1.copyValueOf(ch);

        System.out.println(s1);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ReverseWords q = new ReverseWords(s);
        q.findWords(s);
        q.displayReverse();
    }

}
