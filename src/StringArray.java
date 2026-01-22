public class StringArray {
    static void einfacheAusgabe() {
        //            0123456789012345
        String str = "Das ist ein Text";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.printf("%s %n", c);
        }
    }

    static int anzahlVorkommen(String str, char search)
    {
        int anzahl = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == search)
            {
                anzahl++;
            }
        }
        return anzahl;
    }

    static String umdrehen(String str)
    {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            res = c + res;
        }
        return res;
    }
    public static void main(String[] args) {
        //einfacheAusgabe();
        int anzahl1 = anzahlVorkommen("Heute ist Donnerstag, das ist der Programmiertag", 't');
        int anzahl2 = anzahlVorkommen("Morgen ist Freitag, das ist der beste Tag weil der Tag darauf Samstag ist", 'a');
        System.out.println(anzahl1 + anzahl2);
        String res = umdrehen("asdfjklö");
        System.out.println(res);
    }
}
