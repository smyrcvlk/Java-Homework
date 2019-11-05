package day18_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylisttask17 {
    public static void main(String[] args) {
        //17. Write a Java program to empty an array list.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");
        System.out.println(colors);

        colors.removeAll(colors);

        System.out.println("array list after " + colors);


    }
}
