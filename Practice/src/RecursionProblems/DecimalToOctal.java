package RecursionProblems;

import java.util.Scanner;

public class DecimalToOctal
{
    public void convert(int n)
    {
        if (n < 8)
        {
            System.out.print(n);
            return;
        }

        convert(n / 8);
        double oct = (n * 0.1) / 8 /0.1;
        int dif = n / 8;
        int eff = (int) (8 * (oct - dif));
        System.out.print(eff);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DecimalToOctal q = new DecimalToOctal();
        q.convert(n);
    }
}
