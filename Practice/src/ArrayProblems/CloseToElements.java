package ArrayProblems;

import java.util.Scanner;

public class CloseToElements
{
     public int getKey(int[] ar, int key)
     {
         int l = 0;
         int h = ar.length - 1;
         int mid;
         int mid2 = 0;
         while (l <= h)
         {
             mid = (l + h) / 2;
             if (ar[mid] == key)
             {
               return mid;
             }
             if (ar[mid] > key)
             {
                 h = mid - 1;
             }
             if (key > ar[mid] )
                 l = mid + 1;
             mid2 = mid;
         }
         return mid2;
     }

     public int[] getCloseElements(int mid, int k, int[] ar)
     {
         int [] arr = new int[k];
         arr[0] = ar[mid];
         int close = ar[mid];
         int j = 1;
         int i = 1;
         int count = 1;



            while (j <= mid && i <= (ar.length - mid)-1)
            {


                if (Math.abs(ar[mid + i] - close) < Math.abs(ar[mid-j] - close) )
                {
                    arr[count] = ar[mid + i];
                    count++;
                    if (count == k)
                        return arr;
                    i++;

                }

                if (Math.abs(ar[mid + i] - close) > Math.abs(ar[mid-j] - close))
                {
                    arr[count] = ar[mid - j];
                    count++;
                    if (count == k)
                        return arr;

                    j++;
                }

                if (Math.abs(ar[mid + i] - close) == Math.abs(ar[mid-j] - close))
                {
                    arr[count] = ar[mid - j];
                    count++;
                    if (count == k)
                        return arr;

                    j++;

                }
            }

            return arr;
     }

     public void display(int[] arr)
     {
         for (int i = 0; i < arr.length; i++)
         {
             System.out.print(arr[i] + " ");
         }
     }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = InputUtil.inputArray(n);

        System.out.println("Enter the key ");
        int key = sc.nextInt();

        System.out.println("Enter the value k closest elements you want to look for");
        int k = sc.nextInt();

        CloseToElements q = new CloseToElements();
        int mid = q.getKey(ar,key);
        int[] arr = q.getCloseElements(mid,k,ar);
        q.display(arr);
    }
}
