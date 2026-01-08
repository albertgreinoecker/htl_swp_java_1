public class TypeCast {
    public static void main(String[] args) {

        // byte passt immer in einen int rein
        byte b = 12;
        int i = b;

        //       128   129   130
        // byte -128, -127, -126, -125, ... , 126, 127
        int i2 = 130;
        byte b2 = (byte)i2;
        System.out.println(b2);

        //Es ist trotzdem ein Type Cast notwendig
        int i3 = 1;
        byte b3 = (byte) i3;

        double d4 = 1.9345;
        int i4 = (int)d4;
        System.out.println("i4:" + i4);

        String s = "Das ist ein Text";

        double d = 0;
        for (int j = 0; j < 30; j++) {
            d = d + 0.1;
            System.out.println(d);
        }
    }
}
