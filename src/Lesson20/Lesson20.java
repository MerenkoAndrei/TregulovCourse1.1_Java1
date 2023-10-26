package Lesson20;

public class Lesson20 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.eat();
    }

}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("spat");
    }
}

class Teacher extends Employee {
    void eat() {
        System.out.println("kushat uchitel"); // overriding method
    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}
