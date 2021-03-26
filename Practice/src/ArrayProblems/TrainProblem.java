//package ArrayProblems;
//
//public class TrainProblem
//{
//    public int getMinPlatforms(int[] ar, int[] dep)
//    {
//
//        int plat = 1;
//        int j = 0;
//        int n = 0;
//        for (int i = 0; i < ar.length; i++)
//        {
//            j++;
//            if (ar[i+1] > ar[j-1] && j != 1)
//            {
//                for (int k = j; k >= 1; k--)
//                {
//                    if (ar[i+1] > ar[k-1])
//                    {
//                        n++;
//                    }
//                    else
//                    {
//                        plat++;
//                    }
//
//                }
//            }
//            else if (ar[i+1] > ar[j-1] && j == 1)
//            {
//                n++;
//            }
//            else
//            {
//                plat++;
//            }
//
//        }
//        return plat;
//    }
//
//    public static void main(String[] args)
//    {
//        int[] arr = {900, 930, 1000, 1045};   // 900 910 915
//        int[]dep = {925, 945, 1045, 1130};
//
//        TrainProblem trains = new TrainProblem();
//        int platforms = trains.getMinPlatforms(arr, dep);
//        System.out.println(platforms);
//
//    }
//}
