package DDArrayProblems;

import java.util.Scanner;

public class PrintSpiral
{
    private int ar[][];
    private int i;
    private int j;
    private int m;
    private int z;

    public PrintSpiral(int n)
    {
        ar = new int[n][n];
        i = 0;
        j = 0;
        m = 1;
        z = 0;
    }

    public void square()
    {
        int p = ar.length;
        storeSpiral(p);

    }

    public void storeSpiral(int p)
    {
        if ( p!= 0 )
        {
            for (j = j; j < p+z; j++)
            {
                ar[i][j] = m;
                m++;
            }
            j--;

            for (i = i; i < p+z; i++)
            {
                if (ar[i][j] == 0)
                {
                    ar[i][j] = m;
                    m++;
                }
            }
            i--;

            for (j = j; j >= 0+z; j--)
            {
                if (ar[i][j] == 0)
                {
                    ar[i][j] = m;
                    m++;
                }
            }
            j++;

            for (i = i;  i >= 0+z; i--)
            {
                if (ar[i][j] == 0)
                {
                    ar[i][j] = m;
                    m++;
                }
            }
            i++;
            p = p - 2;
            z = z + 1;
            i = i + 1;
            j = j + 1;
            if (p == 1)
            {
                ar[i][j] = m;
                displaySpiral();
            }
            else if(p == 0)
                displaySpiral();
            else
            storeSpiral(p);

        }
    }

    public void displaySpiral()
    {
        for (int k = 0; k < ar.length; k++)
        {
            for (int l = 0; l < ar.length; l++)
            {
                System.out.print(ar[k][l] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of n for a n*n matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintSpiral s = new PrintSpiral(n);
        s.square();
    }
}
