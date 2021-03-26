package ArrayProblems;

import java.util.Scanner;

public class IdentityMatrix
{
    private int ar[][];
    private Scanner sc;

    public IdentityMatrix(int n)
    {
        ar = new int[n][n];
        sc = new Scanner(System.in);
    }

    public void createMatrix()
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
    }

    public void checkifIdentityMatrix()
    {
        boolean isIdentityMatrix = true;
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                if ((i == j && ar[i][j] != 1) || (i != j && ar[i][j] != 0))
                {
                    isIdentityMatrix = false;
                    break;
                }
            }

            if (!isIdentityMatrix)
                break;
        }

        if (isIdentityMatrix)
            System.out.println("It is an identity matrix");
        else
            System.out.println("It is not an identity matrix");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of n for a n*n matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        IdentityMatrix s = new IdentityMatrix(n);
        s.createMatrix();
        s.checkifIdentityMatrix();
    }


}
