package Lesson16;

public class Homework16 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Good Day!!!");
        StringBuilder sb2 = new StringBuilder(50);
        StringBuilder sb3 = new StringBuilder(sb2);
        System.out.println(sb1.length());
        System.out.println(sb1.charAt(5));
        System.out.println(sb1.indexOf(" "));
        String s = sb1.substring(5);
        System.out.println(s);
        String s2 = sb1.substring(5, 8);
        System.out.println(s2);
        System.out.println(sb1.subSequence(5, 8));
        sb1.append("Drug))))!!!");
        System.out.println(sb1);
        System.out.println(sb1.insert(9, "Andrei"));
        StringBuilder sb4 = new StringBuilder("Hello World");
        System.out.println(sb4.delete(6, 11));
        System.out.println(sb4.deleteCharAt(0));
        System.out.println(sb4.reverse());
        StringBuilder sb5 = new StringBuilder("Vsem Privet");
        sb5.replace(0, 4, "Andrei");
        System.out.println(sb5);
        System.out.println(sb5.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb.capacity());

        StringBuilder sb6 = new StringBuilder("123");
        StringBuilder sb7 = sb6.append("45");
        sb7 = sb7.append("6").append("7");
        System.out.println("sb7 = " + sb7);
        System.out.println("sb6 = " + sb6);
        System.out.println(sb6 == sb7);
        System.out.println(sb6.equals(sb7));

        StringBuilder sbd = new StringBuilder("Hello");
        String str = new String(sbd);
        System.out.println(str);

        StringBuffer sbf = new StringBuffer("Drug");
        String str1 = new String(sbf);
        System.out.println(str1);

    }

}

