package day18_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylisttask12 {
    public static void main(String[] args) {
        //12. Write a Java program to extract a portion of a array list.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");
        System.out.println(colors);
        List<String> sub_list= colors.subList(0,2);
        System.out.println(sub_list);

    }
}
