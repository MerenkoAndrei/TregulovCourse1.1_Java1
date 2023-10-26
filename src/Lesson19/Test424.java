package Lesson19;

public class Test424 {
    public static void main(String[] args) {
        Doktor doc = new Doktor();
        doc.name = "Ivan";
        doc.age = 25;
        doc.experience = 2;
        doc.eat();
        doc.specializacya = "Terapevt";
        doc.sleep();
        doc.lechit();
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

class Doktor extends Employee {
    String specializacya;

    void eat() {

    }

    void lechit() {
        System.out.println("lechit");
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("vodit");
    }
}
