import java.util.Arrays;

public class MatrixLoesungen {
    static void aufgabe01(int[][] mat)
    {
        System.out.printf("Anzahl Zeilen: %d %n", mat.length);
        System.out.printf("Anzahl Spalten: %d %n", mat[0].length);
    }

    static void ausgabe(int[][] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] zzMatrix(int groesse, int obergrenze)
    {
        int[][] mat = new int[groesse][groesse];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int)(Math.random()*obergrenze);
            }
        }
        return mat;
    }
    static int anzahl0en(int[][] mat)
    {
        int cnt = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static int summe(int[][] mat)
    {
        int summe = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                    summe += mat[i][j];
            }
        }
        return summe;
    }

    static int[] zeile(int[][] mat, int zeilenNr)
    {
//        int[] z = new int[mat[zeilenNr].length];
//        for (int i = 0; i < mat[zeilenNr].length; i++) {
//            z[i] = mat[zeilenNr][i];
//        }
//        return z;
        return mat[zeilenNr];
    }

    static boolean gewonnen(char[][] spielfeld)
    {
        for (int i = 0; i < spielfeld.length; i++) {
            String zeile = "";
            for (int j = 0; j < spielfeld[i].length; j++) {
                zeile += spielfeld[i][j];
            }
            if (zeile.contains("OOOO") || zeile.contains("XXXX")) return true;
        }
        return false;
    }

    static boolean vergleich(int[][] mat1, int[][] mat2)
    {
        if (mat1.length != mat2.length) return false;

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) return false;
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[][] mat = { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        aufgabe01(mat);
//        ausgabe(mat);
//        int[][] matZZ = zzMatrix(10,10);
//        System.out.println("Die Zufallszahlen-Matrix:");
//        ausgabe(matZZ);
//        int cnt = anzahl0en(matZZ);
//        System.out.println("Anzahl 0en: " + cnt);
//        int summe = summe(matZZ);
//        System.out.println("summe der Werte: " + summe);
//        int[] z = zeile(matZZ, 2);
//        System.out.println(Arrays.toString(z));

        char[][] spielfeld = {
                {'.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'X', '.', '.', '.'},
                {'.', '.', 'O', 'X', '.', '.', '.'},
                {'.', 'O', 'O', 'O', 'X', '.', '.'},
                {'O', 'X', 'X', 'X', 'X', 'O', '.'}
        };

        boolean g = gewonnen(spielfeld);
        System.out.println("Gewonnen:" + g);

    }
}
