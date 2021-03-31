package RecursionProblems;

import java.util.Scanner;

public class XPowerY
{
    int prod = 1;
    public int calculation(int x, int y)
    {
        if (y == 1 && prod == 1)
            return x;
        if (y == 0)
            return 1;
        else
            {
                prod = prod * x;
                y--;
                if (y != 0)
                calculation(x,y);
                else
                    return prod;
            }
        return prod;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter the value of y");
        int y =sc.nextInt();

        XPowerY q = new XPowerY();
        System.out.println(q.calculation(x,y));
    }

}
