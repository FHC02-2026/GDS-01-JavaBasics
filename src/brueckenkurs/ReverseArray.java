package brueckenkurs;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        String[] input = {"Hallo", "Max", "!", "Wie", "geht", "es", "dir", "?"};
        System.out.println(Arrays.toString(reverseArray(input)));
        System.out.println(Arrays.toString(reverseArrayV2(input)));
        System.out.println(Arrays.toString(reverseArrayWithWhile(input)));

    }

    public static String[] reverseArray(String[] arrayToReverse) {
        // 1. leeres Array anlegen um Platz für die Werte (String) zu schaffen -> Platzhalter
        String[] reversed = new String[arrayToReverse.length];

        // 2. Über arrayToReverse iterieren
        for (int i = 0; i < arrayToReverse.length; i++) {
            String value = arrayToReverse[i];
            int indexToMoveTo = reversed.length - i - 1;

            // 3. Innerhalb der Schleife -> das letzte Element auf das Erste des Platzhalters legen
            reversed[indexToMoveTo] = value;
        }
        // 4. Platzhalter Array retournieren
        return reversed;
    }

    public static String[] reverseArrayV2(String[] arrayToReverse) {
        // 1. leeres Array anlegen um Platz für die Werte (String) zu schaffen -> Platzhalter
        String[] reversed = new String[arrayToReverse.length];

        // 2. Über arrayToReverse iterieren
        for (int i = 0, j = reversed.length - 1; i < arrayToReverse.length; i++, j--) {
            // 3. Innerhalb der Schleife -> das letzte Element auf das Erste des Platzhalters legen
            reversed[j] = arrayToReverse[i];
        }
        // 4. Platzhalter Array retournieren
        return reversed;
    }

    public static String[] reverseArrayWithWhile(String[] arrayToReverse) {
        String[] reversed = new String[arrayToReverse.length];
        int arrayToReverseIndex = 0;
        int reversedIndex = reversed.length - 1;

        while (reversedIndex >= 0) {
            String value = arrayToReverse[arrayToReverseIndex];
            reversed[reversedIndex] = value;
            // !!!!! laufvariablen erhöhen/verringern -> modifizieren
            arrayToReverseIndex++;
            reversedIndex--;
        }
        return reversed;
    }
}
