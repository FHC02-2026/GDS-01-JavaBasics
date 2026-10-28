package brueckenkurs;

public class WinterreifenPflichtDemo {

    public static void main(String[] args) {

        System.out.println(isWinterreifenPflicht2(3, false));

        boolean isWPflicht = isWinterreifenPflicht(12, true);
        printResult(isWPflicht);

        printResult(isWinterreifenPflicht(6, true));
    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        if (temperatur < 4) {
            return true;
        }

        if (temperatur < 10 && rutschigeFahrbahn) {
            return true;
        }

        return false;
    }

    public static void printResult(boolean isWinterreifenPflicht) {
        if (isWinterreifenPflicht) {
            System.out.println("Bitte unbedingt Winterreifen verwenden!");
        } else {
            System.out.println("Winterreifen sind nicht unbedingt erforderlich");
        }
    }

    public static void printResult2(boolean isWinterreifenPflicht) {
        if (!isWinterreifenPflicht) { // negieren mit ! (sprich, aus true wird false und umgekehrt
            System.out.println("Winterreifen sind nicht unbedingt erforderlich");
        } else {
            System.out.println("Bitte unbedingt Winterreifen verwenden!");
        }
    }

    public static boolean isWinterreifenPflicht2(int temperatur, boolean rutschigeFahrbahn) {
       return temperatur < 10 && rutschigeFahrbahn || temperatur < 4;
    }
}
