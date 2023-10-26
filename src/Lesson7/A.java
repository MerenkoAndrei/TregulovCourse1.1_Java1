package Lesson7;

public class A {
    public double salary;

    public void dvoinayazp() {
        System.out.println(salary * 2);
    }

    public A(double salary1) {
        salary = salary1;
    }

    public static void main(String[] args) {
        A a = new A(500);
        System.out.println(a.salary);
        a.dvoinayazp();
    }
}

class C {
    public static void main(String[] args) {
        A a = new A(500);
        System.out.println(a.salary);
        a.dvoinayazp();
    }
}
