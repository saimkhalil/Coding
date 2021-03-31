package DDArrayProblems;

import java.util.Scanner;

public class ProductOfMatrix
{
    private int ar1[][];
    private int ar2[][];
    private int ar3[][];
    private Scanner sc;

    public ProductOfMatrix(int m , int n , int o,  int p )
    {
        sc = new Scanner(System.in);
        ar1 = new int[m][n];
        ar2 = new int [o][p];
        ar3 = new int [m][p];

    }

    public void checkCondition(int m , int n , int o, int p)
    {
        if (n == o)
        {
            System.out.println("Condition satisfies for multiplication of matrix");

            getInput(ar1);
            getInput(ar2);
            getProduct();
            display(ar1);
            display(ar2);
            display(ar3);


        }
        else
        {
            System.out.println("Condition not satisfied");
        }
    }

    public void getInput(int [][] ar)
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

    public void  getProduct()
    {
        int a1 = 0;
        for (int i = 0; i < ar1.length; i++)
        {
            for (int j = 0; j < ar2[i].length; j++)
            {
                for (int k = 0; k < ar1[i].length; k++)
                {
                   a1 = ar1[i][k] * ar2[k][j] + a1;
                }
                ar3[i][j] = a1;
                a1 = 0;
            }
        }
    }

    public void display(int [][] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix1 ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns in matrix1");
        int n = sc.nextInt();

        System.out.println("Enter the number of rows in matrix2");
        int o = sc.nextInt();
        System.out.println("Enter the number of columns in matrix2");
        int p = sc.nextInt();

        ProductOfMatrix s = new ProductOfMatrix(m,n,o,p);
        s.checkCondition(m,n,o,p);

    }



}
