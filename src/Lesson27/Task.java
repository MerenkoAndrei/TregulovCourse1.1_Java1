package Lesson27;

import java.io.*;

public class Task {
    static int abs() {
        int a = 5;
        try {
            File f = new File("Text5.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman");
            System.out.println("переменная в catch блоке равна - " + a);
            return a;
        } finally {
            a = 10;
            System.out.println("eto block finally");
            System.out.println("переменная в finally блоке равна - " + a);
            //return 7;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abs());
    }
}
