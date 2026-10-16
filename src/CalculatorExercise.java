/**
 * Aufgabenstellung:
 * Methoden für arithmetische Operationen erstellen inkl. Rückgabewert:
 * - addieren
 * - subtrahieren
 * - multiplizieren
 * - dividieren
 * - Berechnung Restwert
 * <p>
 * Erstellen einer Methode, welche das Resultat auf der Konsole ausgibt
 */

// umbenennen von Klassen mittels Rechtklick + Rename (Shift + F6)
public class CalculatorExercise {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;

        int result = add(number1, number2);
        System.out.println("result = " + result);

        result = add(1,2);
        printHelper(1, 2, result, "Addition");

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        result = subtract(number1, number2);
        printHelper(number1, number2, result, "Subtraktion");

        // multiply aufrufen und direkt an printHelper übergeben
        printHelper(number1, number2, multiply(number1, number2), "Multiplikation");
        printHelper(3, 3, multiply(3, 3), "Multiplikation");

        printHelper(number1, number2, divide(number1, number2), "Dividieren");

        // Division durch 0
        printHelper(number1, 0, divide(number1, 0), "Dividieren");
    }

    public static int add(int a, int b) {
        int result = a + b;
        // speichert a + b in die variable resutl

        return result; // gibt er nicht result retour sondern nur den Wert der in result steckt => zB: 3
    }

    public static int subtract(int param1, int param2) {
//        int result = param1 - param2;
//        return result;
        return param1 - param2;
    }

    public static int multiply(int number1, int number2) {
        int result = number1 * number2;
        //printHelper(number1, number2, result, "Multiplikation");
        return result;
    }

    public static double divide(int a, int b) {
        // Wenn Divisor ungleich 0 ist, dann dividieren, ansonsten 0 retour liefern
        if (b != 0) {
            return a / (b * 1.0);
        } else {
            return 0;
        }
    }

    public static double divide2(int a, int b) {
        // Wenn Divisor ungleich 0 ist, dann dividieren, ansonsten 0 retour liefern
        if (b == 0) {
            System.out.println("Dividieren durch 0 nicht erlaubt");
            return 0;
        }
        return a / (b * 1.0);
    }

    public static double divide3(int a, int b) {
        // Wenn Divisor ungleich 0 ist, dann dividieren, ansonsten 0 retour liefern
        double res = 0;
        if (b == 0) {
            System.out.println("Dividieren durch 0 nicht erlaubt");
        } else {
            res = a / (b * 1.0);
        }
        return res;
    }

    public static void printHelper(int number1, int number2, int result, String method) {
        System.out.println("Resultat der Berechnung: " + method);
        System.out.println("Input 1: " + number1);
        System.out.println("Input 2: " + number2);
        System.out.println("Resultat: " + result);
        System.out.println("----------------------");
    }

    // andere Methodensignatur erlaubt Methoden mit gleichem Namen
    // Methodensignatur = Name + Parameterliste
    public static void printHelper(int number1, int number2, double result, String method) {
        System.out.println("Resultat der Berechnung: " + method);
        System.out.println("Input 1: " + number1);
        System.out.println("Input 2: " + number2);
        System.out.println("Resultat: " + result);
        System.out.println("----------------------");
    }

}