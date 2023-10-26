package Lesson15;

public class DZ15 {
    String color;
    String engine;

    DZ15(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public DZ15 abc(String cvet) {
        DZ15 d2 = new DZ15(cvet, "v4");
        return d2;
    }

    public static void main(String[] args) {
        DZ15 d = new DZ15("red", "v6");
        DZ15 d1 = d.abc("black");
        System.out.println(d.color);
    }

}
