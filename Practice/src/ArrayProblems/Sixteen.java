package ArrayProblems;

public class Sixteen
{
    public void searchElement(int[] ar, int key)
    {
        int l = 0;
        int h = ar.length-1;
        int mid1 = (l+h) / 2;
        int mid2 = mid1 + 1;

        while(l < mid1 && mid2 < h)
        {
            if (ar[l] == key)
            {
                System.out.println(l);
                break;
            }
            if (ar [mid1] == key)
            {
                System.out.println(mid1);
                break;
            }
            if (ar [mid2] == key)
            {
                System.out.println(mid2);
                break;
            }
            if (ar [h] == key)
            {
                System.out.println(h);
                break;
            }
            l++;
            mid1--;
            mid2++;
            h--;
        }

    }

    public static void main(String[] args)
    {
        int[] ar = InputUtil.inputArray(16);
        Sixteen q = new Sixteen();
        q.searchElement(ar,4);
    }
}
// reach to the element in at max 4 steps while by using binary search for 16 elements takes 8 steps at max.