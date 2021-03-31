package Sorting;

import ArrayProblems.InputUtil;

import java.util.Scanner;

public class MergeSortRecursion
{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        MergeSortRecursion q = new MergeSortRecursion(n);
        q.partition(0,n - 1);
        q.display();


    }

    int[] ar;
    int[] arr;

    public MergeSortRecursion(int n)
    {
        ar = InputUtil.inputArray(n);
        arr = new int[n];
    }


    public void partition(int l, int h)
    {
        int mid;
        if (l < h)
        {
            mid = (l + h) / 2;
            partition(l,mid);
            partition(mid + 1,h);
            merge(l,mid,h);


        }


    }


    public void merge( int l, int mid, int h)
    {
        for (int i = 0; i < ar.length; i++)
        {
            arr[i] = ar[i];
        }


        int i = l;
        int j = mid + 1;
//        int k = i;
//
//        while (i <= mid && j <= h)
//        {
//            if (arr[i] < arr[j])
//            {
//                ar[k++] = arr[i++];
//            }
//            if (arr[j] < arr[i])
//            {
//                ar[k++] = arr[j++];
//            }
//
//
//
//        }
//
//        if (i != mid + 1 && j == h + 1)
//        {
//            while (i <= mid)
//            {
//                ar[k] = arr[i];
//                k++;
//                i++;
//            }
//        }
//        if (i == mid + 1 && j != h + 1)
//        {
//            while (j <= h)
//            {
//                ar[k] = arr[j];
//                k++;
//                j++;
//            }
//        }

        for (int k = l; k <= h; k++)
        {
            if (i > mid)
                ar[k] = arr[j++];
            else if (j > h)
                ar[k] = arr[i++];
            else if (arr[j] < arr[i])
                ar[k] = arr[j++];
            else
                ar[k] = arr[i++];
        }

    }

    public void display()
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
