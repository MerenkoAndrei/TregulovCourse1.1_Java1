package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) {
        a = a * 2;
        return a;
    }

    public double zp2() {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee("Ivan", 100.55);
        double d = em1.uvelichitel(em1.salary);
        System.out.println(d);
        System.out.println(em1.salary);
        em1.zp2();
        System.out.println(em1.zp2());
    }
}
