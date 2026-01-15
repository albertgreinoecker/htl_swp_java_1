public class StringTest {

    public static void main(String[] args) {
        char c = 'A';
        String s1 = "ASDFASDF";
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

        int pos = s1.indexOf('F');
        System.out.println("Position von F: " + pos);
        pos = s1.indexOf('F', 4);
        System.out.println("2. Position von F: " + pos);
        pos = s1.indexOf('F', 14);
        System.out.println("3. Position von F: " + pos);

        String htl = "Hallo wir sind in der HTL am Programmieren";
        String htl2 = htl.replace("sind", "waren");
        htl2 = htl2.replace("Hallo", "Tschüss");
        System.out.println(htl2);
        htl2 = htl2.replace('i', 'u');
        System.out.println(htl2);

        String htl3 = htl.substring(2);
        System.out.println("SUBSTRING1:" + htl3);
        String htl4 = htl.substring(2, 6);
        System.out.println("SUBSTRING2:" + htl4);

        boolean b1 = htl.startsWith("Hallo");
        System.out.println("Fängt mit Hallo an:" + b1);

        boolean b2 = htl.startsWith("hallo");
        System.out.println("Fängt mit hallo an:" + b2);
    }
}
