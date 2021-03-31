package RecursionProblems;

import ArrayProblems.InputUtil;

import java.util.Scanner;

public class TwoWayMergeSort
{
    public int[] merge(int[] ar1 , int[] ar2, int[] ar)
    {
        int i = 0, j = 0;

        for (int k = 0; k < ar.length; )
        {
            if (i != ar1.length || j != ar2.length)
            {
                if (ar1[i] > ar2[j])
                {
                    ar[k] = ar2[j];
                    j++;
                    k++;
                }
                if (ar2[j] > ar1[i])
                {
                    ar[k] = ar1[i];
                    i++;
                    k++;
                }
            }
            if (j == ar2.length || i == ar1.length)
            {
                if (j == ar2.length && i != ar1.length)
                {
                    for (i = i; i < ar1.length; i++)
                    {
                        ar[k] = ar1[i];
                        k++;
                    }
                    return ar;
                }

                if (i == ar1.length && j != ar2.length)
                {
                    for (j = j; j < ar2.length; j++)
                    {
                        ar[k] = ar2[j];
                        k++;
                    }
                    return ar;
                }


            }

        }
        return ar;

    }

    public void display(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i]);
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        System.out.println("Enter the size of the first array ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println("Enter the size of the second array");
        int n = sc.nextInt();

        int[] ar1 = InputUtil.inputArray(m);
        int[] ar2 = InputUtil.inputArray(n);


        int ar[] = new int[ar1.length + ar2.length];

        TwoWayMergeSort q = new TwoWayMergeSort();
        q.merge(ar1, ar2 , ar);
        q.display(ar);
    }

}
