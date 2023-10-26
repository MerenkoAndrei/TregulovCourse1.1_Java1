package Lesson18;

public class Lesson18 {
    static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public static void main(String... opachki) {
        summa("Privet", 2, 3, 3, 2);
    }
}
