import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

    static int countWords(String fName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fName));
        int anzahl = 0;
        while (sc.hasNext()) {
            String zeile = sc.next();
            //System.out.println(zeile);
            anzahl++;
        }
        System.out.println("Die Anzahl der Wörter: " + anzahl);
        sc.close();
        return anzahl;
    }

    static void printWithoutComment(String fName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fName));
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            if (!line.startsWith("#"))
            {
                System.out.println(line);
            }
        }
        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        //countWords("test.txt");
        printWithoutComment("conf.txt");
    }
}
