import java.util.ArrayList;

public class Arraylisttask15 {
    public static void main(String[] args) {
        //15. Write a Java program to join two array lists.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);

        ArrayList<String> colors2= new ArrayList<>();
        colors2.add("pink");
        colors2.add("blue");
        colors2.add("yellow");

        System.out.println(colors2);

        ArrayList<String> a= new ArrayList<>();
        a.addAll(colors);
        a.addAll(colors2);
        System.out.println(a);

    }
}
