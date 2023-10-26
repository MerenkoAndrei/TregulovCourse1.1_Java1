package Lesson22;

public class Animal {
    String showName() {
        return "some Animal";
    }

    void showIfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {
    String showName() {
        return "Mouse";
    }

    public static void main(String[] args) {
        Animal a = new Mouse();
        a.showIfo();
    }
}