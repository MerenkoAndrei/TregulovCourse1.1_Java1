package Lesson24;

public class Tesk {

    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();
        Employee[] array = {emp1, emp2, emp3};
        for (Employee emp : array) {
            emp.work();
        }

    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Teacher Helps");
    }

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Driver Helps");
    }

    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Doctor Helps");
    }

    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}