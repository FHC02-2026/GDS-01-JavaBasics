public class ArithmetischeOperationen {

    public static void main(String[] args) {

        // addieren
        int res = 3 + 2;
        System.out.println("res = " + res); // STRG + D

        // subtrahieren
        res = 3 - 2;
        System.out.println("res = " + res); // STRG + D

        // multiplizieren
        res = 3 * 2;
        System.out.println("res = " + res); // STRG + D

        // dividieren
        int a = 3;
        int b = 2;
        double resDivi = 3 / 2.0;
        System.out.println("resDivi = " + resDivi);

        resDivi = a / (b * 1.0);
        System.out.println("resDivi = " + resDivi);

        // modulo (restwert)
        res = 3 % 2;
        System.out.println("res = " + res); // STRG + D


        // Dividieren durch 0 nicht möglich
        //System.out.println(2 / 0);


        // Unärer Operator

        int x = 1;
        System.out.println("x = " + x);

        // post-inkrement
        int y = x++; // zuerst zuweisung zu y (y = 1), dann x um 1 erhöht (x = x + 1)
        System.out.println("x = " + x); // 2
        System.out.println("y = " + y); // 1

        x = 1;
        y = ++x; // zuerst x um 1 erhöht (x = x + 1), dann wurde x zu y zugewiesen (y = 2)
        System.out.println("x = " + x); // 2
        System.out.println("y = " + y); // 2

        // analog -- operator
        int i = 2;
        int j = i--;

        System.out.println("j = " + j); // erwarten: 2
        System.out.println("i = " + i); // erwarten: 1

        i = 2;
        j = --i;
        System.out.println("j = " + j); // erwarten: 1
        System.out.println("i = " + i); // erwarten: 1


        // vergleichsoperatoren
        int t = 3;
        int z = 5;

        boolean u = t == z;
        System.out.println("u = " + u);

        u = t != z;
        System.out.println("u = " + u);

        u = t < z;
        System.out.println("u = " + u);

        u = t > z;
        System.out.println("u = " + u);
    }
}
