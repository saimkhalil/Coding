package StackAndQueue;

import java.util.Random;
//to check
public class FindMaximum
{
    public int getMaximum()
    {
        Stack<Integer> stack = new StackImpl<>();
        Stack<Integer> stack1 = new StackImpl<>();
        Random random = new Random();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++)
        {
            stack.push(random.nextInt(99));

            if (stack.peek() >= max)
            {
                max = stack.peek();
                stack1.push(max);
            }
        }
        stack.display();
        for (int i = 0; i < 6; i++)
        {
            if (stack.peek() != stack1.peek())
            {
                stack.pop();
            }
            else if (stack.peek().equals(stack1.peek()) && stack1.size() != 1)
                {
                    stack.pop();
                    stack1.pop();
                }
            else
            {
                stack.pop();
            }
        }
        System.out.println();
        return stack1.peek();
    }



    public static void main(String[] args)
    {
           FindMaximum findMaximum = new FindMaximum();
           int max = findMaximum.getMaximum();

           System.out.println("----------------------");
           System.out.println(max);
    }
}
