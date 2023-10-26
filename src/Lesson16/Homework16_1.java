package Lesson16;

public class Homework16_1 {
    public static boolean ravenstvo(StringBuilder sbd, StringBuilder sbd1) {
        boolean result = true;
        if (sbd.length() == sbd1.length()) {
            for (int i = 0; i < sbd.length(); i++) {
                if (sbd.charAt(i) != sbd1.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Andrei");
        StringBuilder sbd1 = new StringBuilder("Andrei");
        boolean a = Homework16_1.ravenstvo(sbd, sbd1);
        System.out.println(a);
    }
}
