package nov_4Arraylisthomework;

import java.util.ArrayList;

public class Arraylisttask18 {
    public static void main(String[] args) {
        //18. Write a Java program to test an array list is empty or not.

        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");
        System.out.println(colors);

        colors.removeAll(colors);

        System.out.println("array list after " + colors.isEmpty());
    }
}
