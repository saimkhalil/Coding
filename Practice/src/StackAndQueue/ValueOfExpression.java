package StackAndQueue;

public class ValueOfExpression
{
    public String evaluate(String s)
    {
        Stack<Character> stack = new StackImpl<>();
        int length = s.length();
        String temp = null;

        for (int i = 0; i < length; i++)
        {
            if (s.charAt(i) != ')')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                StringBuilder sb = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    sb.append(stack.pop());
                }

                stack.pop(); // popping out '('
                sb.reverse();
                String result = evaluate(sb);
                temp = result;
                for (int j = 0; j < result.length(); j++)
                {
                    stack.push(result.charAt(j));
                }
            }
        }
        return temp;

    }

     /* Evaluates Binary expression of the form operand operator operand
     * and return the result
     * e.g. "123+7"
     * returns "130"
     * Operator belongs to {+, -, *, /}
     */
    private String evaluate(StringBuilder expression)
    {
        int length = expression.length();
        String[] s2;
        String s1;
        for (int i = 0; i < length; i++)
        {
            if (expression.charAt(i) == '*')
            {
                s1 = expression.toString();
                s2 = s1.split("[*]");


                int v1 = Integer.parseInt(s2[0]);
                int v2 = Integer.parseInt(s2[1]);

                int result = v1 * v2;
                String s3 = result + "";
                return s3;
            }

            else if (expression.charAt(i) == '/')
            {
                s1 = expression.toString();
                s2 = s1.split("[/]");


                int v1 = Integer.parseInt(s2[0]);
                int v2 = Integer.parseInt(s2[1]);

                int result = v1 / v2;
                String s3 = result + "";
                return s3;
            }

            else if (expression.charAt(i) == '-')
            {
                s1 = expression.toString();
                s2 = s1.split('-' + "");

                int v1 = Integer.parseInt(s2[0]);
                int v2 = Integer.parseInt(s2[1]);

                int result = v1 - v2;
                String s3 = result + "";
                return s3;
            }

            else if (expression.charAt(i) == '+')
            {
                s1 = expression.toString();
                s2 = s1.split("[+]");

                int v1 = Integer.parseInt(s2[0]);
                int v2 = Integer.parseInt(s2[1]);

                int result = v1 + v2;
                String s3 = result + "";
                return s3;
            }

        }
        return null;

    }

    public static void main(String[] args)
    {
        ValueOfExpression v = new ValueOfExpression();
        System.out.println(v.evaluate("(13+9)")); // 22
        System.out.println(v.evaluate("((13+9)-22)")); //0
        System.out.println(v.evaluate("((5+((6-3)*4))-9)"));//8
        System.out.println(v.evaluate("((5+((6-3)*4))-(9-3))"));//11



    }
}
