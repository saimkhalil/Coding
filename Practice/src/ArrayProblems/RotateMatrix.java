package ArrayProblems;

import java.util.Scanner;

public class RotateMatrix

//    4, 8, 3, 0}, {4, -5, 60, 89}, {17, 88, 29, 67}, {45, 78, 21, 0}
{
    private Scanner sc;

    public RotateMatrix()
    {
        sc = new Scanner(System.in);
    }

    public void storeMatrix(int n)
    {
        int ar[][] = new int[n][n];
        int length = ar.length;
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                System.out.println("Enter the " +i +","+j + "index of the matrix" );
                ar[i][j] = sc.nextInt();
            }
        }
        display(ar);
        rotation(ar);
    }

    int m = 0;
    int i = 0;
    int j = 0;
    public void rotation(int[][] ar)
    {
        int swap1,swap2,swap3,swap4;
        int p = ar.length;

        for (j = j; j < p-m; j++)
        {
            if(j != p-m-1)
            {
                swap1 = ar[j][p - 1];
                swap2 = ar[p - 1][p - 1 - j];
                swap3 = ar[p - 1 - j][i];
                ar[j][p - 1] = ar[i][j];
                ar[p - 1][p - 1 - j] = swap1;
                ar[p - 1 - j][i] = swap2;
                ar[i][j] = swap3;
            }
        }
        j = j - p + m;
        m = m + 1;
        i++;
        j++;
        if (p % 2 == 0)
        {
            if (p/2 - 1 < i)
            {
                display(ar);
                return;
            }
        }
        if (p-1-m == i)
            display(ar);
        else
        rotation(ar);
    }

    public void display(int[][] ar)
    {
        for (int k = 0; k < ar.length; k++)
        {
            for (int l = 0; l < ar.length; l++)
            {
                System.out.print(ar[k][l] + " ");
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

        RotateMatrix q = new RotateMatrix();
        q.storeMatrix(n);

    }
}
