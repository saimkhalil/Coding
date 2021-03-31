package DDArrayProblems;

import java.util.Scanner;

public class DisplayDiagonal
{
    private Scanner sc;
    private int ar[][];

    public DisplayDiagonal(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n][n];
    }

    public void input()
    {
        System.out.println("Give the values for the matrix");

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                System.out.println("Enter the value for the position (" +i + ", " +j + ")" );
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    public void displayMatrix()
    {
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                System.out.print(ar[i][j] + "\t");
            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
    }


    // going to display right diagonal in this question

    public void displayRightDiagonal()
    {
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                if ( i == j )
                {
                    System.out.print(ar[i][j]);
                    break;
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
    }

    public void displayLeftDiagonal()
    {
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                if ( i + j == ar.length - 1)
                {
                    System.out.print(ar[i][j]);
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of n for a n*n matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DisplayDiagonal s = new DisplayDiagonal(n);
        s.input();
        s.displayMatrix();
        s.displayRightDiagonal();
        s.displayLeftDiagonal();
    }

}
