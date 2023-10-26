package Lesson15;

public class Homework {
    public static void main(String[] args) {
        String s1 = new String("Privet");
        //метод -  length()
        int a = s1.length();
        System.out.println(a);

        //метод - charAt()
        char c1 = s1.charAt(3);
        System.out.println(c1);

        //метод - indexOf()
        int i1 = s1.indexOf('t');
        System.out.println(i1);

        //метод - indexOf()
        int i2 = s1.indexOf("vet");
        System.out.println(i2);

        //метод - startsWith()
        boolean b = s1.startsWith("Pri");
        System.out.println(b);

        //метод - startsWith()
        boolean b2 = s1.startsWith("vet", 3);
        System.out.println(b2);

        //метод - endsWith
        boolean b3 = s1.endsWith("et");
        System.out.println(b3);

        //метод - substring
        String s2 = s1.substring(3);
        System.out.println(s2);

        //метод - substring
        String s3 = s1.substring(2, 5);
        System.out.println(s3);

        //метод - trim()
        String s4 = s1.trim();
        System.out.println(s4);

        //метод - replace
        String s5 = s1.replace('v', 'z');
        System.out.println(s5);

        //метод - replace()
        String s6 = s1.replace("vet", "mer");
        System.out.println(s6);

        //метод - concat()
        String s7 = " Drug";
        System.out.println(s1.concat(s7));

        //метод - toLowerCase()
        String s8 = s1.toLowerCase();
        System.out.println(s8);

        //метод - toUpperCase()
        String s9 = s1.toUpperCase();
        System.out.println(s9);

        //метод - contains()
        boolean b4 = s1.contains("Pri");
        System.out.println(b4);

        String sr = "Hello world";
        String sr1 = "Uraaa";
        String sr3 = sr.concat(sr1).trim().replace("Uraaa", "Урааа").substring(6, 11);
        System.out.println(sr3);
        System.out.println(sr.substring(sr.indexOf('w')));
    }
}
