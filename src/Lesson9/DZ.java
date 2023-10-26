package Lesson9;

public class DZ {
    String name;
    int course;
    static int count;
    int a;

    public DZ(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount() {

        System.out.println("Vsego studentov sozdano - " + count);
    }


    public void showInfo() {
        System.out.println("Welcome to the Test3 class");
    }

    void abc() {
        a++;
    }

    public static void main(String[] args) {
        DZ t = new DZ("Vasya", 2);
        t.showInfo();
        showCount();

    }
}
