package PriorityQueue;

public class CreateMaxHeap
{
    int[] ar;

    CreateMaxHeap(int [] ar)
    {
        this.ar = ar;
    }
    // demo array input       7 14 9 6 3 11 17 9 6 19
    private void swim(int length, int ind)
    {
        while (ind/2 >= 1 && ind < length)
        {
            if (ar[ind/2] < ar[ind])
            {
                int ex = ar[ind];
                ar[ind] = ar[ind/2];
                ar[ind/2] = ex;
                ind = ind /2;
            }
        }
    }

    private void sink(int length, int ind)
    {
        while (2*ind < length)
        {
            int j = 2 * ind;

            if (ar[j] < ar[j+1])
            {
                j = j + 1;
            }

            if (ar[ind] < ar[j])
            {
                int ex = ar[ind];
                ar[ind] = ar[j];
                ar[j] = ex;
                ind = j;
            }
            ind = j;

        }
    }


    public void createMaxHeap()
    {
        int length = ar.length;

        for (int i = 0; i < ar.length; i++)
        {
            sink(ar.length,length-1);
            length = length - 1;
        }
    }


    public static void main(String[] args)
    {
        int[] ar = {7 ,14 ,9 ,6 ,3 ,11 ,17 ,9 ,6 ,19};
        CreateMaxHeap nMaxValues = new CreateMaxHeap(ar);
        nMaxValues.createMaxHeap();

        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + "\t");
        }
        System.out.println();
    }
}