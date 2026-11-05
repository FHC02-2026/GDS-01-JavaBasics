package brueckenkurs;

public class UmsatzDemo {

    public static void main(String[] args) {

        // umsätze von jänner bis dezember anlegen
        double[] umsaetze = {1.5, 4, 20, 3, 3, 777.77, 44, 1900, 12, 13, 11, 12};
        int countOfIncreasesGT10 = getUmsatzsteigerungGT10(umsaetze);
        System.out.println("countOfIncreasesGT10 = " + countOfIncreasesGT10);

//        int countOfIncreasesV2 = getUmsatzsteigerungGT10v2(umsaetze);
//        System.out.println("countOfIncreasesV2 = " + countOfIncreasesV2);
//
//        System.out.println("Ergebnis: " + getUmsatzsteigerungGT10(umsaetze));


        System.out.println(sum(umsaetze));

    }

    public static int getUmsatzsteigerungGT10(double[] umsatzliste) {
        int count = 0;

        // iteration - schleife
        // for-schleife, while-schleife
        for (int i = 1; i < umsatzliste.length; i++) {

            // innerhalb der for-schleife -> prüfen ob der umsatz zum vormat um mehr als 10% gestiegen ist
            double previousMonth = umsatzliste[i - 1];
            double currentMonth = umsatzliste[i];

            if (currentMonth > previousMonth) {
                // wenn umsatz >= 10% -> dann counter erhöhen
                double increase = (currentMonth - previousMonth) / previousMonth * 100;

                if (increase >= 10) {
                    System.out.println("increase = " + increase);
                    count++;
                }
            }
        }
        // wenn die for-schleifen fertig ist -> count retournieren
        return count;
    }

    public static int getUmsatzsteigerungGT10v2(double[] umsatzliste) {
        int count = 0;

        // iteration - schleife
        // for-schleife, while-schleife
        for (int i = 0; i < umsatzliste.length - 1; i++) {

            // innerhalb der for-schleife -> prüfen ob der umsatz zum vormat um mehr als 10% gestiegen ist
            double previousMonth = umsatzliste[i];
            double currentMonth = umsatzliste[i + 1];

            if (currentMonth > previousMonth) {
                // wenn umsatz >= 10% -> dann counter erhöhen
                double increase = (currentMonth - previousMonth) / previousMonth * 100;
                if (increase >= 10) {
                    count++;
                }
            }
        }
        // wenn die for-schleifen fertig ist -> count retournieren
        return count;
    }

    public static double sum(double[] umsaetze) {
        // die summe über alle monate bilden
        // 1. hilfsvariable anlegen (zwischenspeicher)
        // 2. iterieren
        // 3. summieren
        // 4. zwischenspeicher retournieren
        // summe retour liefern

        double sum = 0;

        for (int i = 0; i <= umsaetze.length - 1; i++) {
            sum += umsaetze[i];
            // gleiche wie: sum = sum + umsaetze[i];
        }

        return sum;
    }
}
