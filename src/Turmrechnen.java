public class Turmrechnen {

    public static void main(String[] args) {
        final double START = 13.7;
        final double WIE_OFT = 20;

        double berechnung = START;
        for (int i = 1; i < WIE_OFT; i++) {
            double berechnungAlt = berechnung;
            berechnung = berechnung * (i+1);
            System.out.printf("Durchlauf %d:          %,.2f * %d = %,.2f %n", i, berechnungAlt, i+1, berechnung);
        }

        for (int i = 1; i < WIE_OFT; i++) {
            double berechnungAlt = berechnung;
            berechnung = berechnung / (i+1);
            System.out.printf("Durchlauf %d:          %,.2f : %d = %,.2f %n", i, berechnungAlt, i+1, berechnung);
        }
    }
}
