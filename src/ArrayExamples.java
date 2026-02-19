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

    public static void main(String[] args) {
        int[] xx = new int[3];
        xx[0] = 10;
        xx[1] = 20;
        xx[2] = 30;
        ausgabe(xx);
        int[] xx2 = new int[2];
        ausgabe(xx2);

        int s = sum(xx);
    }
}
