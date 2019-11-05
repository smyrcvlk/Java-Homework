package day18_Arraylist;

import java.util.ArrayList;

public class arraylisttask21 {
    public static void main(String[] args) {

//21. Write a Java program to replace the second element of a ArrayList with the specified element.
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("pink");
        colors.add("black");

        System.out.println("Original array list: " + colors);
        String new_color = "White";
        colors.set(1,new_color);

        int num=colors.size();
        System.out.println("Replace second element with 'White'.");
        for(int i=0;i<num;i++)
            System.out.println(colors.get(i));

    }
}
