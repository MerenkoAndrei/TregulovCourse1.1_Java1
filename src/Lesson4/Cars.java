package Lesson4;

public class Cars {
    String color = "Red";
    String engine = "v6";

}

class test11 {
    public static void main(String[] args) {
        int a;
        Cars car = new Cars(); // car - содержит ссылку на новый обьект
        Cars car1 = new Cars(); // car1 - содержит ссылку на новый обьект

        /** так же можно присвоить адрес на один и тот же обьект
         * пример: Cars car = new Cars();
         * Cars car1 = car; - присваиваем тот же адрес на обьект ,переменной car1*/
        car.color = "black";
        car.engine = "v8";
        System.out.print("Cvet: " + car.color + "\n" + "Motor: " + car.engine);
    }
}
