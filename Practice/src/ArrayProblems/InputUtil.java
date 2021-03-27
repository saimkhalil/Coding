package ArrayProblems;

import java.util.Scanner;

public class InputUtil {

    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray(int n)
    {
        int ar[] = new int[n];
        System.out.println("Enter " + n + " values for the array");

        for (int p = 0; p < ar.length; p++)
        {
            ar[p] = sc.nextInt();
        }

        return ar;
    }

    public static int[][] inputDoubleArray(int m, int n)
    {
        int[][] ar = new int[m][n];
        System.out.println("Enter " + m*n + " values for the matrix" );
        for (int p = 0; p < ar.length; p++)
        {
            for (int q = 0; q < ar[p].length; q++)
            {
                ar[p][q] = sc.nextInt();
            }
        }
        return ar;
    }
}
