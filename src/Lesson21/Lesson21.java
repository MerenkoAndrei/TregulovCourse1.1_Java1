package Lesson21;
import Lesson11.Car;

import java.util.ArrayList;
import java.util.List;

public class Lesson21 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(0,"Hello");
        for(String s:list){
            System.out.println(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3));

        System.out.println();

    }
}

