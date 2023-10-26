package Lesson6;

public class Homework6 {
    int sum() {
        int result = 0;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int sum(int a) {
        int m = a;
        System.out.println("Сумма всех чисел: " + m);
        return m;

    }

    int sum(int a, int b) {
        int u = a + b;
        System.out.println("Сумма всех чисел: " + u);
        return u;
    }

    int sum(int a, int b, int c) {
        int p = a + b + c;
        System.out.println("Сумма всех чисел: " + p);
        return p;
    }

    int sum(int a, int b, int c, int z) {
        int i = a + b + c + z;
        System.out.println("Сумма всех чисел: " + i);
        return i;
    }
}

class Test23 {
    public static void main(String[] args) {
        Homework6 hh = new Homework6();
        hh.sum();
        hh.sum(2);
        hh.sum(5, 6);
        hh.sum(2, 4, 6);
        hh.sum(5, 5, 4, 6);
    }
}
