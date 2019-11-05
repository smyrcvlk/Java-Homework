package day18_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylisttask14 {
    public static void main(String[] args) {
        //14. Write a Java program of swap two elements in an array list.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");
        System.out.println(colors);

        Collections.swap(colors, 2,4);

        System.out.println("after swap " + colors);
    }
}
