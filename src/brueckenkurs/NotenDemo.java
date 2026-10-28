package brueckenkurs;

public class NotenDemo {

    public static void main(String[] args) {


        System.out.println(getNotentext(91.7));
        System.out.println(getNotentext(76));

    }

    public static String getNotentext(int punkte) {

        if (punkte >= 90) {
            return "Sehr Gut";
        }

        if (punkte >= 78 ) {
            return "Gut";
        }

        if (punkte >= 65) {
            return "Befriedigend";
        }

        if (punkte >= 51) {
            return "Genügend";
        }

        return "Nicht Genügend";
    }

    public static String getNotentext(double punkte) {

        if (punkte >= 90) {
            return "Sehr Gut";
        }

        if (punkte >= 78 ) {
            return "Gut";
        }

        if (punkte >= 65) {
            return "Befriedigend";
        }

        if (punkte >= 51) {
            return "Genügend";
        }

        return "Nicht Genügend";
    }

    public static String getNotentext2(int punkte) {

        if (punkte >= 90) {
            return "Sehr Gut";
        } else if (punkte >= 78 ) {
            return "Gut";
        } else if (punkte >= 65) {
            return "Befriedigend";
        } else if (punkte >= 51) {
            return "Genügend";
        } else {
            return "Nicht Genügend";
        }
    }

    public static String getNotentext3(int punkte) {

        String notenText = "Nicht Genügend";

        if (punkte >= 90) {
            notenText = "Sehr Gut";
        } else if (punkte >= 78 ) {
            notenText = "Gut";
        } else if (punkte >= 65) {
            notenText = "Befriedigend";
        } else if (punkte >= 51) {
            notenText = "Genügend";
        }

        return notenText;
    }
}
