package RecursionProblems;


import ArrayProblems.InputUtil;

import java.util.Scanner;

public class BinarySearch
{
    //l = 0     h = ar.length - 1
    public int getIndex(int[] ar, int key,int l, int h)
    {
        int  mid = (l + h) / 2;
        if (l <= h)
        {

            if (ar[mid] == key)
                return mid;

            else if (key > ar[mid])
            {
                l = mid + 1;
                return getIndex(ar, key, l, h);
            }
            else
            {
                h = mid - 1;
                return getIndex(ar, key, l, h);
            }

        }
        return -1;
    }


    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = InputUtil.inputArray(n);

        System.out.println("Enter the value of key");
        int key = sc.nextInt();

        BinarySearch q = new BinarySearch();
        System.out.println(q.getIndex(ar,key,0, ar.length - 1));;


    }
}


