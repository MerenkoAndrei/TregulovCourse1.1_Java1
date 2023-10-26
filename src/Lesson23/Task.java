package Lesson23;

public class Task {
    public static void main(String[] args) {
        Figura f = new Kvadrat();
        System.out.println(f.kolichestvoStoron);
        f.ploshad();
        f.perimetr();
        Figura f1 = new Prymougolnik();
        f1.ploshad();
        f1.perimetr();
        Figura f2 = new Okrujnost();
        f2.ploshad();
        f2.perimetr();
    }
}

abstract class Figura {
    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура");
    }
}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Периметр квадрата = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Площадь квадрата = " + storona1 * storona1);
    }
}

class Prymougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Периметр прямоугольника = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Площадь прямоугольника = " + storona1 * storona2);
    }

}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;


    public void perimetr() {
        System.out.println("Периметр окружности = " + 2 * radius * 3.14);
    }

    public void ploshad() {
        System.out.println("Площадь окружности = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura {
    void def() {
        System.out.println("Это четырехугольник");
    }
}
