package brueckenkurs;

public class TurmDemo {

    public static void main(String[] args) {


        int start = 2;
        int tmp = start;
        int result = 0;

        while (start <= 9) {
            result = start * tmp;
            System.out.println(tmp + " * " + start + " = " + result);

            tmp = result;
            start++;

        }

        int i = 2;
        while (i <= 9) {
            result = tmp / i;
            System.out.println(tmp + " / " + i + " = " + result);
            tmp = result;
            i++;
        }

    }
}
