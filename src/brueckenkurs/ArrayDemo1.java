package brueckenkurs;

public class ArrayDemo1 {

    public static void main(String[] args) {

        int[] zahlen1 = new int[3];
        zahlen1[0] = 3;
        zahlen1[1] = 4;
        zahlen1[2] = 5;

        int[] zahlen2 = {7, 1, 3};

        // Welche Größe hat zahlen2?
        System.out.println("zahlen2 hat die größe: " + zahlen2.length);

//        int res = zahlen1[0] + zahlen2[0];
//        System.out.println("res = " + res);
//        res = zahlen1[1] + zahlen2[1];
//        System.out.println("res = " + res);

        System.out.println("schreibe das ergebnis der addition auf die konsole");


        for (int i = 0; i < zahlen1.length && i < zahlen2.length; i++) {
            int res = zahlen1[i] + zahlen2[i];
            System.out.println("res = " + res);
        }

        for (int i = 0; i < zahlen1.length; i++) {
            int res = zahlen1[i] + zahlen2[i];
            System.out.println("res = " + res);
        }
    }
}
