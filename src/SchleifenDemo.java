public class SchleifenDemo {


    public static void main(String[] args) {

        // While Demonstration

        // Wichtigste Schritte
        // 1. Zähler/Counter initalisieren
        // 2. Bedingung aufstellen
        // 3. Modifizieren (Zähler/Counter updaten)

        // Anforderung: Die Zahlen von 1 - 10 auf die Konsole schreiben
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        int a = 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);


        System.out.println("Verwende eine While-Schleife");

        int i = 1; // Ausganswert

        while (i <= 10) { // Bedingung prüfen
            System.out.println(i);
            i++; // !!!!!!! modifizieren
            // Beim ersten Aufruf ist i = 1
            // Beim zweiten Aufruf ist i = 2
        }

        int j = 10;
        while (j >= 1) { // Bedingung prüfen
            System.out.println(j);
            j--; // !!!!!!! modifizieren
            // Beim ersten Aufruf ist i = 1
            // Beim zweiten Aufruf ist i = 2
        }

        System.out.println("Continue & Break & Return");
        System.out.println("Beginne while-Schleife:");
        int c = 0;
        while (c < 5) {
            c++;
            System.out.println("c = " + c);
            if (c < 2) {
                System.out.println("Continue");
                continue;
            }
            System.out.println("Nach Continue");
            //System.out.println("Jetzt break");
            //break;
            //System.out.println("Nach break"); -> Compiler schmeißt hier error meldung
            System.out.println("Jetzt return");
            return;
        }
        System.out.println("Aus der Schleife draußen");

    }
}
