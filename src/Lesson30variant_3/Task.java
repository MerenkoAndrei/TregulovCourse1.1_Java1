package Lesson30variant_3;
import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.5);
        Student st2 = new Student("Nikolai", 'm', 28, 4, 7.3);
        Student st3 = new Student("Egor", 'm', 21, 2, 6.5);
        Student st4 = new Student("Yan", 'm', 24, 3, 8.1);
        Student st5 = new Student("Jenya", 'm', 20, 1, 7.4);
        Student st6 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st7 = new Student("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        list.add(st7);
        StudentInfo si = new StudentInfo();
        si.testStudents(list, (Student st) -> {return st.avgGrade > 8.5;});
        System.out.println("______________________");
        si.testStudents(list, (Student st) -> {return st.avgGrade < 7.5;});
        System.out.println("______________________");
        si.testStudents(list, (Student st) -> {return st.age > 25;});
        System.out.println("______________________");
        si.testStudents(list, (Student st) -> {return st.age < 28;});
        System.out.println("______________________");
        si.testStudents(list, (Student st) -> {return st.sex == 'm';});
        System.out.println("______________________");
        si.testStudents(list, (Student st) -> {return st.avgGrade > 7.5 && st.age < 23 && st.sex == 'f';});
        System.out.println("______________________");

    }
}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student s) {
        System.out.println("Имя студента: " + s.name + "\nПол студента: " + s.sex + "\nВозраст студента: " + s.age +
                "\nКурс: " + s.course + "\nСредняя оценка: " + s.avgGrade);
        System.out.println();
    }

    void testStudents(ArrayList<Student> aL, StudentChecks sc) {
        for (Student s : aL) {
            if (sc.testStudent(s)) {
                printStudent(s);
            }
        }
    }

}

interface StudentChecks {
    boolean testStudent(Student s);
}

