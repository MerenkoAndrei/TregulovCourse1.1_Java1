package Lesson30variant_2;

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

        si.printStudentsOverGrade(list, 8.5);
        System.out.println("______________________");
        System.out.println("______________________");
        si.printStudentsUnderGrade(list, 9);
        System.out.println("______________________");
        System.out.println("______________________");
        si.printStudentsUnderAge(list, 25);
        System.out.println("______________________");
        System.out.println("______________________");
        si.printStudentsOverAge(list, 27);
        System.out.println("______________________");
        System.out.println("______________________");
        si.printStudentsBySex(list, 'm');
        System.out.println("______________________");
        System.out.println("______________________");
        si.printStudentsBySex(list, 'f');
        System.out.println("______________________");
        System.out.println("______________________");
        si.printStudentsMixCondition(list, 7.2, 23, 'f');
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


    void printStudentsOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }
}


