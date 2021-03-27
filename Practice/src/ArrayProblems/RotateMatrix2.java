package ArrayProblems;

import java.util.Scanner;

public class RotateMatrix2
{
    private Scanner sc;

    public RotateMatrix2()
    {
        sc = new Scanner(System.in);
    }

    public void rotate(int[][] ar)
    {
        int i = 0;
        int j = 0;
        int swap1,swap2,swap3;
        int p = ar.length;
        int l;
        if(p % 2 == 0)
            l = p / 2;
        else
            l = p/2 + 1;

        for (int k = 0; k < l; k++)
        {
            i = k;
            j = k;


            for (; j < p ;)
            {
                if (j != p  - 1)
                {
                    swap1 = ar[j][p - 1];
                    swap2 = ar[p - 1][p - 1 - j + k];
                    swap3 = ar[p - 1 - j + k][i];
                    ar[j][p - 1] = ar[i][j];
                    ar[p - 1][p - 1 - j + k] = swap1;
                    ar[p - 1 - j + k][i] = swap2;
                    ar[i][j] = swap3;
                }
                j++;
            }
            p = p - 1;
        }
    }

    public void display(int[][] ar)
    {
        for (int k = 0; k < ar.length; k++)
        {
            for (int l = 0; l < ar.length; l++)
            {
                System.out.print(ar[k][l] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n************************");
    }


    public static void main(String[] args)
    {
        System.out.println("Enter the value of n for a n*n matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        RotateMatrix2 q = new RotateMatrix2();
        int[][] ar = InputUtil.inputDoubleArray(n, n);
        q.display(ar);
        q.rotate(ar);
        q.display(ar);


    }
}
