package Lesson2;

public class PrimitivesData {
    public static void main(String[] args) {
        byte option_Byte1 = 0xC;
        //16-ричная система исчисления
        byte option_Byte2 = 12;
        // 10-ричная система исчисления
        byte option_Byte3 = 0b1100;
        //2 - ичня система исчисления
        byte option_Byte4 = 0_14;
        // 8-ричная система исчисления

        short option_Short1 = 0b10100010100;
        //2 - ичня система исчисления
        short option_Short2 = 0_2424;
        //8-ричная система исчисления
        short option_Short3 = 1300;
        // 10-ричная система исчисления
        short option_Short4 = 0x514;
        //16-ричная система исчисления

        int option_int1 = 0x0;
        //16-ричная система исчисления
        int option_int2 = 0;
        // 10-ричная система исчисления
        int option_int3 = 0b0;
        //2 - ичня система исчисления
        int option_int4 = 0_0;
        //8-ричная система исчисления

        long option_long1 = 0b111010110111100110100010101L;
        //2 - ичня система исчисления
        long option_long2 = 0_726746425L;
        //8-ричная система исчисления
        long option_long3 = 123456789L;
        // 10-ричная система исчисления
        long option_long4 = 0x75BCD15L;
        //16-ричная система исчисления

        float option_float1 = 2.5f;
        float option_float2 = 2.323f;

        double option_double1 = 2.23341;
        double option_double2 = 23.123123123;

        boolean option_boolean1 = true;
        boolean option_boolean2 = false;

        char option_char1 = 'A';//
        char option_char2 = 55;//
        char option_char3 = '\u0003';//

        System.out.println("Тип byte: " + option_Byte1 + ";" + option_Byte2 +
                ";" + option_Byte3 + ";" + option_Byte4 + ";");
        System.out.println("Тип short: " + option_Short1 + ";" + option_Short2 +
                ";" + option_Short3 + ";" + option_Short3 + ";");
        System.out.println("Тип int: " + ";" + option_int1 + ";" + option_int2 +
                ";" + option_int3 + ";" + option_int4);
        System.out.println("Тип long: " + option_long1 + ";" + option_long2 +
                ";" + option_long3 + ";" + option_long4 + ";");
        System.out.println("Тип float: " + option_float1 + ";" + option_float2 + ";");
        System.out.println("Тип double: " + option_double1 + ";" + option_double2 + ";");
        System.out.println("Тип boolean: " + option_boolean1 + ";" + option_boolean2 + ";");
        System.out.println("Тип char: " + option_char1 + ";" + option_char2 + ";" + option_char3 + ";");
    }
}