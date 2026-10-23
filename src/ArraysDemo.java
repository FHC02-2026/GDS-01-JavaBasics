public class ArraysDemo {

    public static void main(String[] args) {

        // String[] deklarieren
        String[] warenkorb = new String[6];

        // Erstes Element in den Warenkorb
        warenkorb[0] = "Apfel";
        // Zweites Element in den Warenkorb
        warenkorb[1] = "Banane";
        warenkorb[2] = "Tomate";
        warenkorb[3] = "Paprika";
        warenkorb[4] = "Steak";
        warenkorb[5] = "Pommes";

        int[] noten = {1,2,1,3,2};
        // welche länge hat noten? 5
        // höchste Index: 4

        // Wert an der Stelle 3: 3

        int wertAnDerStelle3 = noten[3];
        System.out.println("wertAnDerStelle3 = " + wertAnDerStelle3);

        noten[3] = 1;
        wertAnDerStelle3 = noten[3];
        System.out.println("wertAnDerStelle3 = " + wertAnDerStelle3);

        System.out.println("wert an der Stelle 2: " + noten[2]);

        // alle noten auf die konsole schreiben
//        System.out.println(noten[0]);
//        System.out.println(noten[1]);
//        System.out.println(noten[2]);
//        System.out.println(noten[3]);
//        System.out.println(noten[4]);

        // for schleife
        // um die länge zu bekommen:
        // noten.length => Anzahl der Element (Größe vom Array)

        System.out.println("länge: " + noten.length);
        // letztes Element
        int indexOfLastElement = noten.length - 1;
        System.out.println("lastElement = " + noten[indexOfLastElement]);
        System.out.println("lastElement = " + noten[noten.length - 1]);

        // über alle elemente iterieren
        for (int i = 0; i < noten.length; i++) {
            System.out.println("Meine Note ist: " + noten[i]);
        }

        // nur die 1er Ausgeben
        int countOnes = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] == 1) {
                countOnes += 1;
                System.out.println(noten[i]);
            }
        }

        System.out.println("countOnes = " + countOnes);

        for (int i = 0; i < noten.length; i++) {
            if (noten[i] != 1) {
                continue;
            }
            System.out.println(noten[i]);
        }
        System.out.println("Durch break heraussen");

    }
}
