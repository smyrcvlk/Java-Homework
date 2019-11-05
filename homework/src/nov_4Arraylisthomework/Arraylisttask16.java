package nov_4Arraylisthomework;

import java.util.ArrayList;

public class Arraylisttask16 {
    public static void main(String[] args) {
        //16. Write a Java program to clone an array list to another array list.

        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);

        ArrayList<String> newcolors= (ArrayList< String>)colors.clone();

        System.out.println(newcolors);


    }
}
