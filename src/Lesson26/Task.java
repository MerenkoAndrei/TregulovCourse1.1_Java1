package Lesson26;

import java.io.*;

public class Task {
    public static void main(String[] args) {
        File f = new File("Text9.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem horoshego dnya!!!");
        } catch (FileNotFoundException e) {
            System.out.println("bil poyman exception - " + e);
        } finally {
            System.out.println("eto finally block");
        }
        System.out.println("Danniy kod ne imeet otnosheniya k isklucheniyam");
    }
}
