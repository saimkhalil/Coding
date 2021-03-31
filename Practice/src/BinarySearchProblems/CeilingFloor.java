package BinarySearchProblems;

import ArrayProblems.InputUtil;

import java.util.Scanner;

//greater  than or equal to
public class CeilingFloor
{
    /* Returns index of the element which is greater then or equal
    *  to the input key
    *  @param ar : Query array
    *  @param key : Query Key
    */
//    public int ceiling(int ar[], int key)
//    {
//        // TODO(Saimya): Finish Implementation
//        return -1;
//    }

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
            if (ar[mid] < key)
            {
                for (int i = mid + 1; i < ar.length; i++)
                {
                    if (ar[i] > ar[mid])
                        flag = false;
                    return i;
                }
                if (flag)
                    return -1;
            }
            if(ar[mid] > key)
                return mid;


        }
        return mid;
    }
    // out of main APIS


    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = InputUtil.inputArray(n);

        System.out.println("Enter the key");
        int key = sc.nextInt();

        CeilingFloor q = new CeilingFloor();
        int mid = q.getKey(ar,key);
        System.out.println(q.ceiling(mid,ar,key));

    }
}
