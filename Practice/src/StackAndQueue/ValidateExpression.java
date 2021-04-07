package StackAndQueue;

import java.util.Scanner;

public class ValidateExpression
{

    public boolean isValid(String expression)
    {
        Stack<Character> stack = new StackImpl<>();
        int l = expression.length();

        for (int i = 0; i < l; i++)
        {
            if ("[{(".contains(expression.charAt(i) + ""))
            {
                stack.push(expression.charAt(i));
            }
            else if (")}]".contains(expression.charAt(i) + ""))
            {
                char closing = expression.charAt(i);

                if (stack.isEmpty())
                    return false;

                char opening = stack.peek();
                if ((opening == '{' && closing != '}')
                        || (opening == '(' && closing != ')')
                        || (opening == '[' && closing != ']'))

                    return false;
                else
                    stack.pop();

            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String s = sc.nextLine();
        ValidateExpression validateExpression = new ValidateExpression();
        System.out.println(validateExpression.isValid(s));

    }
}
