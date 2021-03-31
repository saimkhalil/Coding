package StringProblems;

public class ReverseWordd
{
    public String reverse(String s)
    {
        String[] words = s.split("-");
        StringBuilder stringBuilder= new StringBuilder();

        for (int i = 0; i < words.length; i++)
        {
            String temp = reverseWord(words[i]);
            if (!temp.isEmpty())
                stringBuilder.append(temp).append(" ");
        }
        return stringBuilder.toString();
    }

    public String reverseWord(String s)
    {
        StringBuilder st = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length ; i++)
        {
            st.insert(0, s.charAt(i));
        }
        return st.toString();
    }

    public static void main(String[] args) {
        ReverseWordd rev = new ReverseWordd();
        System.out.println(rev.reverse("Saim-is-a-------stupid-person"));
    }
}
