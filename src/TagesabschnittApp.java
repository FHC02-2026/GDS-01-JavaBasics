import java.util.Scanner;

public class TagesabschnittApp {

    public static void main(String[] args) {
        /*
        6-9 -> Früh
        9-12 -> Vormittag
        12-16 -> Nachmittag
        16-20 -> Abend
        20-6 -> Nacht
         */

        int hour = 4;
        printDayTime(hour);
        printDayTime2(hour);
        printDayTime3(hour);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Uhrzeit eingeben:");
        int hourByUser = scanner.nextInt();
        printDayTime(hourByUser);
    }

    // STRG + ALT + L => formattieren
    public static void printDayTime(int hour) {

        if (hour > 24) {
            System.out.println("falsche Uhrzeit angegeben");
            return;
        }

        if (hour > 6 && hour <= 9) {
            System.out.println("Früh");
        } else if (hour > 9 && hour <= 12) {
            System.out.println("Vormittag");
        } else if (hour > 12 && hour <= 16) {
            System.out.println("Nachmittag");
        } else if (hour > 16 && hour <= 20) {
            System.out.println("Abend");
        } else {
            System.out.println("Nacht");
        }
    }

    public static void printDayTime3(int hour) {

        if (hour > 24) {
            System.out.println("falsche Uhrzeit angegeben");
            return;
        }

        if (hour <= 6) {
            System.out.println("Nacht");
        } else if (hour <= 9) {
            System.out.println("Früh");
        } else if (hour <= 12) {
            System.out.println("Vormittag");
        } else if (hour <= 16) {
            System.out.println("Nachmittag");
        } else if (hour <= 20) {
            System.out.println("Abend");
        } else {
            System.out.println("Nacht");
        }
    }

    public static void printDayTime2(int hour) {
        if (hour > 6 && hour <= 9) {
            System.out.println("Früh");
        } else if (hour > 9 && hour <= 12) {
            System.out.println("Vormittag");
        } else if (hour > 12 && hour <= 16) {
            System.out.println("Nachmittag");
        } else if (hour > 16 && hour <= 20) {
            System.out.println("Abend");
        } else if (hour > 20 && hour <= 24 || hour > 0 && hour <= 6) {
            System.out.println("Nacht");
        } else {
            System.out.println("falsche Uhrzeit angegeben");
        }
    }
}
