package Lesson3;

public class Task {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        int a = 5;
        int b = 8;
        int z = a-- - --a + ++a + a++ + a;// 5-3+4+4+5=15
        int m = ++b - b++ + ++b - --b;//9-9+11-10=1
        System.out.println(z + " " + m);
    }
}

class Test {
    public static void main(String[] args) {
        int a = 19;
        double b = a % 5;
        //int x = 1, y = 3, z = 6;

        int x = 6;
        int y = 13;
        int z = ++x - --y + ++x;//7-12+8=3
        z += 8; //11
        boolean c = x < y || y < 0;
        boolean b1 = x < y ^ y < 0;
        System.out.println(z);
    }
}