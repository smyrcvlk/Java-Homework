import java.util.ArrayList;

public class arraylisttask19 {
    public static void main(String[] args) {
        //19. Write a Java program to trim the capacity of an array list the current list size.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);
        colors.trimToSize();

        System.out.println("array list after trim:" + colors);

    }
}
