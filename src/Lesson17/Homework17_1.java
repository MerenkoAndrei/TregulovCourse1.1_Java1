package Lesson17;

import java.util.Arrays;

public class Homework17_1 {
    public static void main(String[] oppanki) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int index1 = Arrays.binarySearch(array1, 5);
        System.out.println(index1);

        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array4[] = array2;
        System.out.println(array2 == array3); // ссылаются на разные обЪекты
        System.out.println(array2 == array4); // ссылаются на один обЪект


    }
}
