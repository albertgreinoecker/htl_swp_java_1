public class LoesungTest2Gruppe2 {
    public static void main(String[] args) {
        /*
        Aufgabe 1:
        schreibe mit System.out.printf die Ausgabe der folgenden Variablen: (20p)
        Der messwert soll für die Ausgabe auf 2 Kommastellen gerundet werden
         */

        String name = "Hubert";
        int alter = 16;
        double messwert = 3.2312455;
        System.out.printf("%s %d %.2f %n", name, alter, messwert);

        /*
        schreibe mittels for-Schleife einen kleinen Teil des Turmrechners, nämlich: (30p)

        13,700000 * 2 = 27,400000
        27,400000 * 3 = 82,200000
        82,200000 * 4 = 328,800000
        328,800000 * 5 = 1644,000000
        1644,000000 * 6 = 9864,000000
        ......
        1666537875600998000,000000 * 20 = 33330757512019960000,000000

        Verwende diese Startwerte
        final double START = 13.7;
        final double WIE_OFT = 20;

        Es ist keine formattierte Ausgabe notwendig
         */

        double START = 13.7;
        final double WIE_OFT = 20;
        for (int i = 2; i < WIE_OFT; i++) {
            double n = START*i;
            System.out.printf("%f * %d = %f %n", START, i, n);
            START = n;
        }

        /*
        Zähle die Anzahl der Zahlen in einem String. Z.b. soll für
        String s = "asd22f4XX5" die Zahl 4 herauskommen, also 2,2,4,5 => 4
        Hinweis: Verwende Character.isDigit(ch) um zu erkennen ob es sich um eine Zahl handelt
         */
        String s = "asd22f4XX5";
        int anz = 0;
        for (int i = 0; i < s.length();i++) {
            if (Character.isDigit(s.charAt(i)))
            {
                anz++;
            }
        }
        System.out.println("Anzahl:" + anz);


        /*
        Nenne alle Datentypen, die eine Fließkommazahl speichern können, aufsteigend nach der Größe des Bereichs (15p)

        Was beinhaltet i?
        byte i = (byte)129;
         */

        // float, double
        // -127
    }
}
