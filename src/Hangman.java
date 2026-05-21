import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {

    static int woerterZaehlen() throws FileNotFoundException {
        Scanner s = new Scanner(new File("woerter.txt"));
        int i = 0;
        while (s.hasNextLine())
        {
            s.nextLine();
            i++;
        }
        s.close();
        return i;
    }
    static String[] leseWoerter() throws FileNotFoundException {
        String[] woerter = new String[woerterZaehlen()];
        Scanner s = new Scanner(new File("woerter.txt"));
        int i = 0;
        while (s.hasNextLine())
        {
            String wort = s.nextLine();
            woerter[i] = wort;
            i++;
        }
        s.close();
        return woerter;
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
    public static void main(String[] args) throws FileNotFoundException {
        String bereitsGezogen = "";
        String[] woerter = leseWoerter();
        for (int i = 0; i < woerter.length; i++) {
            System.out.println(woerter[i]);
        }
        String wort = findeWort();
        String mask = maskiereWort(wort, bereitsGezogen);
    }
}
