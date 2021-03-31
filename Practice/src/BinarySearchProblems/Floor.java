package BinarySearchProblems;

import ArrayProblems.InputUtil;

import java.util.Scanner;

public class Floor
{


        int check = 0;
        public int getKey(int[] ar,int key)

        {
            int l = 0;
            int h = ar.length-1;
            int mid;
            int mid2 = 0;


            while (l <= h)
            {
                mid = (l + h) / 2;
                if (ar[mid] == key)
                    return mid;
                if (key > ar[mid])
                    l = mid + 1;
                if (key < ar[mid])
                    h = mid - 1;
                mid2 = mid;
            }
            check = 1;
            return mid2;

        }

        public int ceiling(int mid, int[] ar,int key)
        {
            if (check == 0)
            {
                return mid;
            }
            boolean flag = true;
            if ( check == 1)
            {
                if (ar[mid] > key)
                {
                    for (int i = mid - 1; i >= 0; i--)
                    {
                        if (ar[i] < ar[mid])
                            flag = false;
                        return i;
                    }
                    if (flag)
                        return -1;
                }
                if(ar[mid] < key)
                    return mid;


            }
            return mid;
        }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = InputUtil.inputArray(n);

        System.out.println("Enter the key");
        int key = sc.nextInt();

        Floor q = new Floor();
        int mid = q.getKey(ar,key);
        System.out.println(q.ceiling(mid,ar,key));

    }

}
