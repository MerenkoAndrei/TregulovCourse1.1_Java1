package Lesson5;

public class Homework5_2 {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Homework5_2(int a, String s, int b, double n, String s1) {
        id = a;
        surname = s;
        age = b;
        salary = n;
        department = s1;
    }

    double uvelichenieZp() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Homework5_2 h = new Homework5_2(12, "Merenko", 31, 50000, "Logistica");
        h.uvelichenieZp();
        System.out.println("\nid: " + h.id + "\n" + "surname:" + h.surname + "\n" + "age:" + h.age + "\n" +
                "salary:" + h.salary + "\n" + "deportament: " + h.department);

    }
}
