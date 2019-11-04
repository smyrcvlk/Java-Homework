import java.util.ArrayList;

public class arraylisttask20 {
    public static void main(String[] args) {
//20. Write a Java program to increase the size of an array list.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        colors.ensureCapacity(8);
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");

        System.out.println("new array list: " + colors);

    }
}
