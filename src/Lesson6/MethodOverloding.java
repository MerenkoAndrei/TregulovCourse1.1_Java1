package Lesson6;

public class MethodOverloding {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}

class Test {
    public static void main(String[] args) {
        MethodOverloding mo = new MethodOverloding();
        mo.show(100);
        mo.show(true);
        mo.show("Privet");
    }
}
