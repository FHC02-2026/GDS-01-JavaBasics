public class ScopeDemo {

    public static void main(String[] args) {
        printMax();
        printMax();
        printMax();
        printMax();
        printMax(); // Duplicate = STRG + D
        printMax(); // Duplicate = STRG + D

        printName("Susi", "Sorglos");
        printName("John", "Doe");
        printName("Strolchi", "");
    }

    public static void printName(String name, String lastName) {
        // int name = 1; // funktioniert nicht, da bereits definiert

        //String lastName = "Mustermann";

        // int lastName = 2; // funktioniert nicht, da bereits definiert
        System.out.println("Mein Name: " + name + " " + lastName);

        {
            //int lastName = 23; // bereits übergeordnet definiert, innerhalb der Methode
            int plz = 8010;
            System.out.println("plz = " + plz);
            // gültigkeit von int plz endet hier

        }

        {
            double plz = 100.20; // gültigkeit von double plz beginnt hier
            System.out.println("plz = " + plz);
            // gültigkeit von double plz endet hier
        }

        // System.out.println(plz); // plz gibt es hier nicht, nur immer inner scope darüber

        // hier endet die Gültigkeit von lastName
        // hier endet die Gültigkeit von name
    }

    public static void printMax() {
        String lastName = "Sorglos";
        System.out.println("Max " + lastName);
    }
}
