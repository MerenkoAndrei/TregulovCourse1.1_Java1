package Lesson13;

public class Dz13 {
}

class DzTest {
    double grade;

    DzTest(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        DzTest t = new DzTest(2);
        /** if (t.grade == 2){
         System.out.println("Плохой студент");
         } else if(t.grade == 3){
         System.out.println("Нужно подтянуть успеваемость");
         } else if(t.grade==4){
         System.out.println("Студент на правильном пути");
         } else if(t.grade == 5){
         System.out.println("Молодец,так держать!!");
         } */
        switch ((int) t.grade) {
            case 2 -> System.out.println("Плохой студент");
            case 3 -> System.out.println("Нужно подтянуть успеваемость");
            case 4 -> System.out.println("Студент на правильном пути");
            case 5 -> System.out.println("Молодец,так держать!!");
            default -> System.out.println("Такой оценки не существует");

        }
    }
}
