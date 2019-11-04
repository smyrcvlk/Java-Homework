import java.util.ArrayList;

public class Arraylisttask13 {
    public static void main(String[] args) {
        //13. Write a Java program to compare two array lists.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        ArrayList<String> colors2= new ArrayList<>();
        colors2.add("pink");
        colors2.add("blue");
        colors2.add("yellow");

        if(colors.contains("pink"))

        {
            System.out.println(" yes");

        }else{
            System.out.println("no");
        }

    }
}
