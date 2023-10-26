package Lesson17;

public class Lesson17 {
    public static void main(String[] args) {
        int[] arrays;
        String[] str;
        double[][] dab;
        int[][] arrays1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arrays1[0][1]);
        int[][] arrays10;

        arrays = new int[8];
        str = new String[3];
        dab = new double[4][2];

        arrays10 = new int[3][];
        System.out.println(str.length);

        str[0] = "Privet";
        str[1] = "Andrei";
        str[2] = "Mashinist";
        System.out.println(str[0] + " " + str[1] + " " + str[2]);

    }

}
