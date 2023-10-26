package Lesson11;

public class Car {
    String cvet;
    String motor;
    int door;

    public Car(String cvet, String motor, int door) {
        this.cvet = cvet;
        this.motor = motor;
        this.door = door;
    }
}

class CarTest {
    public static void cvetcar(Car s1, Car s2) {
        String cvet = s1.cvet;
        s1.cvet = s2.cvet;
        s2.cvet = cvet;

    }

    public static void doorcar(Car c, int door) {
        c.door = door;

    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("red", "V6", 2);
        Car c2 = new Car("black", "v8", 4);
        ct.cvetcar(c1, c2);
        ct.doorcar(c1, 3);
        System.out.println("Информация о первой машине: Цвет " + c1.cvet + "\nМотор: " + c1.motor +
                "\nКоличество дверей: " + c1.door);
        System.out.println("\nИнформация о второй машине: Цвет " + c2.cvet + "\nМотор: " + c2.motor +
                "\nКоличество дверей: " + c2.door);
    }
}
