package Lesson18;

public class Homework18 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for (int a : array) {
            summa += a;
        }
        System.out.println(summa);
        System.out.println();

        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
        System.out.println();

        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] arrays1 : arrays) {
            for (int a : arrays1) {
                System.out.print(a + " ");
            }
        }
    }
}
