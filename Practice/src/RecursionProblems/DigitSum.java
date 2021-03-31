package RecursionProblems;

import java.util.Scanner;

public class DigitSum
{
    int sum = 0;

    public int getSum(int n)
    {

        if (n / 10 == 0)
            return n;
        int dig = n % 10;
        sum = dig + sum;
        n = n / 10;
        if(n / 10 != 0)
            getSum(n);
        else
        {
            sum = sum + n;
            return sum;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DigitSum q = new DigitSum();
        System.out.println(q.getSum(n));

    }
}
