package Lesson7;

public class Dz {
    static int abs(int a, int b, int s) {
        return a * b * s;
    }

    static void abs(int a, int b) {
        int resoult = a / b;
        int resoult1 = a % b;
        System.out.println("Результат деления - " + resoult + "\nОстаток от деления - " + resoult1);
    }
}

class Dz2 {
    public static void main(String[] args) {
        System.out.println(Dz.abs(5, 6, 4));
        Dz.abs(35, 2);

        System.out.println(Dz.abs(2, 5, 4));
        Dz.abs(83, 2);
    }
}
