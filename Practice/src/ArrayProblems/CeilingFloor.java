package ArrayProblems;

import java.util.Scanner;

//greater  than or equal to
public class CeilingFloor
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

    public void display(int mid, int[] ar,int key)
    {
        if (check == 0)
        {
            System.out.println("key is present in the array so , output is " +ar[mid] );
        }
        boolean flag = true;
        if (check == 1)
        {
            if (ar[mid] < key)
            {
                for (int i = mid + 1; i < ar.length; i++)
                {
                    if (ar[i] > ar[mid])
                        flag = false;
                    System.out.println("just greater than the key is " + ar[i]);
                }
                if (flag)
                    System.out.println("no element greater than key");
            }
            if(ar[mid] > key)
                System.out.println("just greater than the key is " +ar[mid]);


        }
    }


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
        q.display(mid,ar,key);

    }
}
