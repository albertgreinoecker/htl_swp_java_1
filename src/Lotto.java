import java.util.Scanner;

public class Lotto {
    static void ausgabe(int[] xx) {
        for (int i = 0; i < xx.length; i++) {
            System.out.printf("%3d", xx[i]);
        }
        System.out.println();
    }

    static boolean kommtVor(int[] a, int z)
    {
        for (int i = 0; i <a.length; i++) {
            if (a[i] == z)
            {
                return true;
            }
        }
        return false;
    }
    static int[] lottoZahlen()
    {
        int[] lz = new int[6];   //Erzeuge Array der groesse 6
        int i = 0;
        while (i < 6) //gehe alle Stellen im Array durch
        {
            int z = (int)(Math.random()*45) + 1; //erzeuge Zufallszahl

            if (!kommtVor(lz, z))
            {
                lz[i] = z; //stelle diese Zufallszahl in das Array an die Stelle i
                i++; // erhoehe die Laufvariable i
            }
        }
        return lz; //gib das erstellte Array zurueck
    }

    static int lottoTip(int[] lottoTip, int[] lottoZiehung)
    {
        int count = 0;
        for (int i = 0; i < lottoTip.length; i++) {
            int tipp = lottoTip[i];
            for (int j = 0; j < lottoZiehung.length; j++) {
                if (lottoZiehung[j] == tipp)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //int[] tipp = {20,10,7,5,1,44};
        int[] tipp = new int[6];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < tipp.length;i++)
        {
            System.out.printf("Bitte die Zahl %d eingeben %n", i+1);
            tipp[i] = s.nextInt();
        }
        s.close();

        for (int i = 0; i < 200; i++) {
            int[] lz = lottoZahlen();
            ausgabe(lz);
            int richtige = lottoTip(tipp, lz);
            System.out.println("RICHTIGE:" + richtige);
        }

    }
}
