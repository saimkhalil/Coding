package Sorting;

import ArrayProblems.InputUtil;

import java.util.Scanner;

public class QuickSort
{
    int[] ar;

    public  QuickSort(int n)
    {
         ar = InputUtil.inputArray(n);
    }

    public void sort(int l , int h)
    {
        if (h <= l)
        return;
        int j = partition(l,h);
        sort(l,j - 1);
        sort(j + 1, h);

    }

    public int partition(int l, int h)
    {
        int exc;
        int i = l;
        int j = h + 1;
        while (true)
        {
            while (ar[++i] < ar[l]) {
                if (i == h)
                    break;
            }


            while(ar[l] < ar[--j])
                if (j == l)
                    break;

            if (i >= j)
                break;

            exc = ar[i];
            ar[i] = ar[j];
            ar[j] = exc;

        }

        exc = ar[l];
        ar[l] = ar[j];
        ar[j] = exc;

        return j;
    }

    public void display()
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        QuickSort q = new QuickSort(n);
        q.sort(0,n-1);
        q.display();

    }

}
