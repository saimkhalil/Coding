package ArrayProblems;

import java.util.Scanner;

public class BinarySearch
{
    private Scanner sc = new Scanner(System.in);

    public void store(int[] ar)
    {
        System.out.println("Enter the values for the array");

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

    }

    public boolean search(int[] ar, int key)
    {
        int l = 0;
        int h = ar.length-1;
        int mid;
        while (l < h)
        {
            mid = (l + h) / 2;
            if (ar[mid] == key)
                return true;
            if (key > ar[mid])
                l = mid + 1;
            if (key < ar[mid])
                h = mid -1;
        }
        return false;
    }


    public void display(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        System.out.println("Enter the key you want to search");
        int key = sc.nextInt();

        BinarySearch q = new BinarySearch();
        q.store(ar);
        q.display(ar);
        System.out.println(q.search(ar,key));
    }
}
