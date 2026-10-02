public class VariableDemo {

    // zum ausführen brauche ich die main
    public static void main(String[] args) {

        // Deklaration
        // Deklarieren = Datentyp + Name
        int a;
        boolean wahr;

        char c;

        int x, y, z;

        // initialisieren = Wertzuweisung

        a = 3;
        wahr = true;

        c = 'C';

        // deklarieren und initialisieren in einem Zug
        int b = 5;
        char d = 'd';

        String word = "Hallo Welt";


        // variable ausgeben
        System.out.println(a);
        //sout + tab
        System.out.println(c);
        // soutv + tab
        System.out.println("word = " + word);


        System.out.println("wahr = " + wahr);


        // wert abändern
        a = 5;
        System.out.println("a = " + a);

        a = 5 + 4;
        System.out.println("a = " + a);


        a = a + 1;
        System.out.println("a = " + a);

        // long
        long l = 8;

        l = a;

        // a = l; -> geht nicht, da long in int nicht platz findet


        String number = "4";
        number = number + 4;
        System.out.println("number = " + number);

        // String concatenation
        String name = "Max";
        name = name + " " + "Mustermann";

        System.out.println("name = " + name);



    }
}
