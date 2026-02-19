
public class ModuloOperator {

    static void mod1()
    {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d : mod3 %d %n", i, i % 3);
        }
    }

    static void mod2()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.print("*");
            if (i % 10 == 0)
            {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        //mod1();
        mod2();
    }
}
