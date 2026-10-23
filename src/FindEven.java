public class FindEven {

    public static void main(String[] args) {

        // Laufe von 1 - 10 und schreibe alle geraden Zahlen auf die Konsole

        // 1. Ausgangswert / Zähler
        int counter = 0;

        // 2. Bedingung / Schleifen Start
        while (counter <= 10) {
            // Nur Gerade zahlen auf die Konsole schreiben
            if (counter % 2 == 0) {
                System.out.println("counter = " + counter);
            }

            // 3. counter modifizieren
            counter++;
        }

    }
}
