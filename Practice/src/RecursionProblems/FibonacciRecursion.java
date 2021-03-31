package RecursionProblems;

import java.util.Scanner;

public class FibonacciRecursion
{
    public int fibonacci(int n)
    {
        if (n == 2)
            return 1;
        if (n == 1)
            return 0;
        int previousTerm = fibonacci(n - 1);
        int prevPreviousTerm = fibonacci(n - 2);
        return previousTerm + prevPreviousTerm;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FibonacciRecursion q = new FibonacciRecursion();
        System.out.println(q.fibonacci(n));
    }


}
