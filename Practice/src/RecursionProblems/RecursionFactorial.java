package RecursionProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursionFactorial
{

    public long getFactorial(int n)
    {
        if (n == 1)
            return 1;

        return getFactorial(n-1) * n;

    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number whose factorial you want to get ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RecursionFactorial q = new RecursionFactorial();
        System.out.println(q.getFactorial(n));

    }
}
