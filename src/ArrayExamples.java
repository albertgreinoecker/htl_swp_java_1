public class ArrayExamples
{
    static void ausgabe(int[] xx) {
        for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }
    }

    static int sum(int[] xx) {
        int sum = 0;
        for (int i = 0; i < xx.length; i++) {
            sum += xx[i];
        }
        return sum;
    }

    static int[] geradeMinusEins(int[] a)
    {
        int[] a2 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)  //wenn gerade
            {
                a2[i] = -1;
            } else
            {
                a2[i] = a[i];
            }
        }
        return a2;
    }

    public static void main(String[] args) {
//        int[] xx = new int[3];
//        xx[0] = 10;
//        xx[1] = 20;
//        xx[2] = 30;
//        ausgabe(xx);
//        int[] xx2 = new int[2];
//        ausgabe(xx2);
//
//        int s = sum(xx);
        //         0 1 2 3 4  5  6
        int[] a = {1,6,4,8,12,13,14};
        int[] a2 = geradeMinusEins(a);
        ausgabe(a2);
    }
}
