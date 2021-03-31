package RecursionProblems;

import java.util.Scanner;

public class SumRecursion
{
    public int sum(int n)
    {
        if(n == 1)
            return 1;
        int prevSum = sum(n-1);
        return prevSum + n;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumRecursion q = new SumRecursion();
        System.out.println(q.sum(n));
    }
}
