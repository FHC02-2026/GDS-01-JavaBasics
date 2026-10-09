public class CarDemo {

    public static void main(String[] args) {

        // hupen
        hupen();
        hupen();
        hupen();

        // starten
        boolean isStarted = starten();
        System.out.println("isStarted = " + isStarted);

        if (isStarted) {
            hupen();
        }

        // gang einlegen
        gangEinlegen(7);
        gangEinlegen(6);
        gangEinlegen(5);

        // bremsen
        bremsen();

    }

    public static void hupen() {
        System.out.println("Huuuuuppppp");
    }

    public static boolean starten() {
        System.out.println("Auto gestartet");
        return true;
    }

    public static void gangEinlegen(int gang) {
        System.out.println(gang + " eingelegt");
    }

    public static void bremsen() {
        System.out.println("Vollbremsung");
        gangEinlegen(0);
    }
}
