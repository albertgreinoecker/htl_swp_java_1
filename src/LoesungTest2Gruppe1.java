public class LoesungTest2Gruppe1 {
    public static void main(String[] args) {
        /*
            Aufgabe 1:
            schreibe mit System.out.printf die Ausgabe der folgenden Variablen:   (20p)
            Für den Namen soll ein Platz von 15 Zeichen reserviert sein
         */
        String name = "Hubert";
        int alter = 16;
        boolean ausInnsbruck = true;
        System.out.printf("%15s %d %b %n", name, alter, ausInnsbruck);

        /*
            Aufgabe 2:
            Bilde die Summe der Zahlen von 1 bis 10 mit einer for Schleife.
            Es soll auch der Rechenweg ausgegeben werden, also 1+2+3+4+5+6+7+8+9+10=55  (30p)
         */

        int erg = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 10)
            {
                System.out.print(i + "=");
            } else
            {
                System.out.print(i + "+");
            }

            erg += i;
        }
        System.out.println(erg);

        /* Aufgabe 3:
        Erzeuge mittels Schleife folgende Ausgabe: D_a_s_ _i_s_t_ _e_i_n_ _S_t_r_i_n_g
        Achte darauf dass beim letzten Zeichen kein _ mehr kommen soll

         */
        String s = "Das ist ein String";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() -1)
            {
                System.out.printf("%s",s.charAt(i));
            } else
            {
                System.out.printf("%s_",s.charAt(i));
            }
        }

        /* Aufgabe 4:
        Nenne alle Datentypen, die eine Ganzzahl speichern können, aufsteigend nach der Größe des Bereichs (15p)

        int i = (int)3.87878;
        Was beinhaltet i?
         */

        //byte, short, int, long
        // i ist 3
    }
}
