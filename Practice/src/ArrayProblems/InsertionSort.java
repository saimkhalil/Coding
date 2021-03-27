package ArrayProblems;

import java.lang.reflect.Array;
import java.util.Scanner;

//ascending order
public class InsertionSort
{
    private Scanner sc;

    public InsertionSort()
    {
        sc = new Scanner(System.in);
    }
    public void sort(int []ar)
    {
        for (int i = 1; i < ar.length; i++)
        {
            int j = i - 1;
            int current = ar[i];
            while(j >= 0 && ar[j] > current)
            {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = current;
        }
    }


//    function signature
//    accessmodifier returntype methodname parameter list
    public void store(int[] ar)
    {
        System.out.println("Enter the values for the array");

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

    }

    public void display(int[] ar)
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
        int[] ar = new int[n];
        InsertionSort q = new InsertionSort();
        q.store(ar);
        q.sort(ar);
        q.display(ar);
    }
}
