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
    public static void main(String[] args) {
        //einmaleins(20);
        koordinaten(10);
    }
}
