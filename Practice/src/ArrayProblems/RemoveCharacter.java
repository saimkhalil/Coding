package ArrayProblems;

import java.util.Scanner;

public class RemoveCharacter
{
//    public String toRemove(String s, char a)
//    {
//        char b,c;
//        int count = 0;
//        int length = s.length();
//        char ar[] = new char[length];
//
//        for (int i = 0; i < length; i++)
//        {
//            ar[i] = s.charAt(i);
//        }
//        for (int i = 0; i < length; i++)
//        {
//            if (ar[i] == a)
//            {
//                count++;
//                for (int j = i + 1; j < length; j++)
//                {
//                    ar[j-1] = ar[j];
//                }
//            }
//        }
//        String s2 = "";
//        for (int i = 0; i < length - count ; i++)
//        {
//         b = ar[i];
//         s2 = s2 + b;
//        }
//        return s2;
//    }

    public String remove(String s, char a)
    {
        int j = 0;
        int length = s.length();
        int count = 0;
        char b;
        char ar[] = new char[length];
        for (int i = 0; i < length; i++)
        {

               if (s.charAt(i) != a)
               {
                   ar[j] = s.charAt(i);
               }
               else
               {
                   count++;
                   j--;
               }
               j++;
        }
        String s2 = "";
        for (int i = 0; i < length - count ; i++)
        {
            b = ar[i];
            s2 = s2 + b;
        }
        return s2;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Enter the character which you want to remove");
        char a = sc.next().charAt(0);

        RemoveCharacter m = new RemoveCharacter();
        System.out.println("the desired string is " + m.remove(s,a));
    }
}

