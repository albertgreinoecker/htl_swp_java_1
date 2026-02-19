public class VerschachtelteSchleifen {
    static void koordinaten(int grenze)
    {
        for (int i = 1; i <= grenze ; i++) {
            for (int j = 1; j <= grenze; j++) {
                System.out.printf("(%2d,%2d)", i, j);
            }
            System.out.println();
        }
    }

    void testBreak()
    {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
            {
                break;
            }
            if (i == 3)
            {
                continue; //gehe in den nächsten Schleifendurchlauf
            }
        }
        //Break bricht die Schleife einfach ab und wir befinden uns an dieser Position
    }

    static void einmaleins(int grenze)
    {
        for (int i = 1; i <= grenze ; i++) {
            for (int j = 1; j <= grenze; j++) {
                System.out.printf("(%2d * %2d = %3d)", i, j, i*j);
            }
            System.out.println();
        }
    }

    static void aufgabe5(String str)
    {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int cnt = 0;
            char c = str.charAt(i);
            if (c == ' ')
                continue;
            //System.out.println(c);
            for (int j = 0; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (c == c2) {
                    cnt++;
                }
            }
            System.out.printf("%s%d ", c, cnt);
        }
    }

    static void aufgabe5Ext()
    {
        //        0123456789012345
        String str = "Das ist ein Text";
        str = str.toLowerCase();
        String processed = "";
        for (int i = 0; i < str.length(); i++) {
            int cnt = 0;
            char c = str.charAt(i);
            if (c == ' '  || processed.contains(c + ""))
                continue;
            //System.out.println(c);
            for (int j = 0; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (c == c2) {
                    cnt++;
                }
            }
            System.out.printf("%s%d ", c, cnt);
            processed += c;
        }
    }

    static void warten() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //einmaleins(20);
        //koordinaten(10);
        //warten();
        aufgabe5("Das ist ein Text");
        aufgabe5("Das auch");
    }
}
