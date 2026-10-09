public class ArithmetischeOperationenDemo {

    public static void main(String[] args) {
        // deklarieren und initialisieren
        int a = 5;
        int b = 2;
        int result;

        // addieren
        result = a + b;
        System.out.println("result = " + result);

        // subtrahieren
        result = a - b;
        System.out.println("result = " + result);

        // multiplizieren
        result = a * b;
        System.out.println("result = " + result);

        // dividieren
        double resultDiv = a / (b * 1.0);
        System.out.println("resultDiv = " + resultDiv);

        // 2. Möglichkeit ohne Variable Deklaration
        System.out.println("resultDiv = " + (a / (b * 1.0)));

        // modulo
        result = a % b;
        System.out.println("result = " + result);

    }
}
