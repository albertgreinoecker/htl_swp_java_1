import java.util.Scanner;

public class ViewGewinnt {
    static boolean spieler; //true: 'X', false: 'O'
    /*
    0...leer
    1...'X'
    2...'O'
     */
    static int[][] spielfeld = new int[3][3];

    static char int2char(int i)
    {
        char[] map = new char[] {' ', 'X', 'O'};
        return map[i];
    }
    static void ausgabe()
    {
        System.out.print("Am Zug: ");
        if (spieler) System.out.println("X");
        else System.out.println("O");{

        }
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.printf("%2s|", int2char(spielfeld[i][j]));
            }
            System.out.println();
        }
    }
    static void init()
    {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = 0;
            }
        }
    }
    static boolean voll() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == 0) return false;
            }
        }
        return true;
    }
    static boolean set(int x, int y)
    {
        if (spielfeld[x][y] != 0) return false;
        int zelle = 2;
        if (spieler) zelle = 1;
        spielfeld[x][y] = zelle;
        spieler = !spieler;
        ausgabe();
        return true;
    }

    static char z(int x, int y)
    {
        return int2char(spielfeld[x][y]);
    }
    static boolean gewonnen()
    {
        String s = z(0,0) + z(0,1) + z(0,2) + "|" +
                z(1,0) + z(1,1) + z(2,2) + "|" +
                z(2,0) + z(2,1) + z(2,2) + "|" +

                z(0,0) + z(1,0) + z(2,0) + "|" +
                z(0,1) + z(1,1) + z(2,1) + "|" +
                z(0,2) + z(1,2) + z(2,2) + "|" +

                z(0,0) + z(1,1) + z(2,2) + "|" +
                z(2,0) + z(1,1) + z(0,2) + "|";
        return s.contains("XXX") || s.contains("OOO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        while (!gewonnen() && !voll())
        {
            System.out.println("Bitte x, y eingeben:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (!set(x,y))
            {
                System.out.println("Ungültiger Zug!");
            }
        }
        ausgabe();
        sc.close();
    }
}
