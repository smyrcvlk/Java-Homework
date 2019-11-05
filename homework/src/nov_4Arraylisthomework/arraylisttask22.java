package nov_4Arraylisthomework;

import java.lang.module.FindException;
import java.util.ArrayList;

public class arraylisttask22 {
    public static void main(String[] args) {

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        ArrayList <String> colors = new ArrayList <String> ();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        System.out.println("\nOriginal array list: " + colors);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = colors.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(colors.get(index));



    }
}
