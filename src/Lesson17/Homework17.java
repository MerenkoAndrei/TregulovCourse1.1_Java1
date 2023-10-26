package Lesson17;

public class Homework17 {
    public static void main(String[] args) {
        String[] arrays;
        int[][] arrays1;
        arrays = new String[3];
        arrays1 = new int[3][];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = "Privet " + i;
            System.out.println(arrays[i]);
        }

        arrays1[0] = new int[5];
        arrays1[1] = new int[2];
        arrays1[2] = new int[7];

        for (int i = 0; i < arrays1.length; i++) {
            for (int j = 0; j < arrays1.length; j++) {
                arrays1[i][j] = i + j;
                System.out.println(arrays1[i][j]);
            }
        }
    }
}
