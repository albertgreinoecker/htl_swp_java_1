public class MatrixExamples {
    static void ausgabe(int[][] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int[][] aMat = new int[2][3]; //[zeile][spalte]
        aMat[1][0] = 10;
        ausgabe(aMat);
        int[] a2 = {1,5,4,3,6};
        System.out.println();
        int[][] aMat2 = { {1,2,3} , {4,5,6} , {7,8 }};
        ausgabe(aMat2);
    }
}
