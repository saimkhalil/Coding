package ArrayProblems;

import java.util.Scanner;

public class StringArray
{
    private Scanner sc;
    private String str[];
    private int ar[];

    public StringArray(int n)
    {
        sc = new Scanner(System.in);
        str = new String[n];
        ar = new int[n];

    }

    public void store()
    {
        for (int i = 0; i < str.length; i++)
        {
            System.out.println("Enter the " + (i+1) + " string for the array");
            str[i] = sc.next();
        }   
    }

    public void countMax()
    {
        int count = 1;
        for (int i = 0; i < str.length; i++)
        {
            for (int j = i + 1; j < str.length; j++)
            {
                if (str[i].equals (str[j]))
                {
                    count++;
                }
            }
            ar[i] = count;
            count = 1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++)
        {
            if (ar[i] > max)
            {
                max = ar[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of strings you are going to provide");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringArray s = new StringArray(n);
        s.store();
        s.countMax();
    }
}
