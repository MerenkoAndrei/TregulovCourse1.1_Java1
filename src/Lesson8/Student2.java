package Lesson8;

public class Student2 {
    String name;
    int course;
    static int count;

    public Student2(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego studentov sozdano - " + count);
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student2 st = new Student2("Vasya", 3);
        Student2 st2 = new Student2("Igor", 4);
        Student2 st3 = new Student2("Ivan", 2);
        Student2.showCount();
        System.out.println(Student2.count);
    }
}
