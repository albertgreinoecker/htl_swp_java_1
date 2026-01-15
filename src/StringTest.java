public class StringTest {
    public static void main(String[] args) {
        char c = 'A';
        String s1 = "ASDF";
        String s2 = "JKLÖ";
        System.out.println(s1 + " " + s2);

        int l = s1.length();
        System.out.println("LÄNGE: " + l);

        String s1Lower = s1.toLowerCase();
        System.out.println(s1Lower);

        char c1 = s1.charAt(1);
        System.out.println("Zeichen an der Stelle 1: " + c1);

        for (int i = 0; i < s1.length(); i++) {
            char ci = s1.charAt(i);
            System.out.println(i + ":" + ci);
        }

    }
}
