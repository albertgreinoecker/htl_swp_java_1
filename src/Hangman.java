public class Hangman {

    static String[] leseWoerter() {
        return null;
    }

    static String findeWort()
    {
        return "";
    }

    static String maskiereWort(String wort, String bereitsGezogen)
    {
        return "";
    }

    static boolean spielZug(char c)
    {
        return true;
    }

    static boolean fertig(String wort, String maskiertesWort)
    {
        return true;
    }
    public static void main(String[] args) {
        String bereitsGezogen = "";
        String[] woerter = leseWoerter();
        String wort = findeWort();
        maskiereWort(wort, bereitsGezogen);
    }


}
