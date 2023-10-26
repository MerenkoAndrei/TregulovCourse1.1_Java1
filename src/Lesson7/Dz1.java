package Lesson7;

public class Dz1 {
    public final static double Pi = 3.14;

    public double ploshad(double radius) {
        double p1 = Pi * radius * radius;
        return p1;
    }

    public static double dlina(double radius2) {
        double d1 = 2 * Pi * radius2;
        return d1;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Ploshad = " + ploshad(radius3));
        System.out.println("dlina = " + dlina(radius3));
    }
}

class TestDZ {
    public static void main(String[] args) {
        Dz1 d = new Dz1();
        d.info(3);
    }
}
