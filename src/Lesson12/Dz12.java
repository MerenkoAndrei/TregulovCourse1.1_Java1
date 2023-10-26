package Lesson12;

public class Dz12 {
    int engine;
    int doorCount;

    Dz12(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class Dz12Test {
    public static void main(String[] args) {
        Dz12 d1 = new Dz12(3, 4);
        Dz12 d2 = new Dz12(2, 5);
        if (d1.engine > d2.engine) {
            if (d1.doorCount > d2.doorCount) {
                System.out.println("Мощность мотора и количество дверей у первого больше");
            } else {
                System.out.println("Мощность мотора у первого больше, а количество дверей меньше");
            }

        } else {
            System.out.println("Мощность мотора у первой машины меньше");
        }
        String s1 = "Andrey";
        String s2 = "ANDREY";
    }
}
