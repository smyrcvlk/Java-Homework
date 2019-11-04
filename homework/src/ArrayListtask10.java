import java.util.ArrayList;
import java.util.Collections;

public class ArrayListtask10 {
    public static void main(String[] args) {

        //10. Write a Java program to shuffle elements in a array list.[advanced]
        ArrayList<String>colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");
        System.out.println("list before shuffling: " + colors );
        Collections.shuffle(colors);
        System.out.println("list after shuffling:"  +  colors);



    }
}
