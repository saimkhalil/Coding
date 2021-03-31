package RecursionProblems;

import java.util.Scanner;

public class DecimalToBinary
{
    public void convert(int n)
    {

        if (n == 1)
        {
            System.out.print(1);
            return;
        }
        convert(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the decimal number to be converted");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DecimalToBinary q = new DecimalToBinary();
        q.convert(n);

    }
}
