package StringProblems;


import java.util.Scanner;

public class ReverseNumber
{

    int rev = 0;
    public int reverse(int n)
    {
        // 321    12345
        int a = 0,b = n;

        while (b != 0)
        {
            a = b % 10;
            b = b / 10;
            rev = rev * 10 + a;

        }
        return rev;

    }


    public static void main(String[] args)
    {
        System.out.println("Enter a valid number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ReverseNumber m = new ReverseNumber();
        System.out.println(m.reverse(n));
    }
}
