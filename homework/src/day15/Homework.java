package day15;

import java.util.Random;

public class Homework {
    //TODO Task
    // 1. Return the number of even ints in the given array.
    // {1,2,3,4,5,6} => 3
    // Hint: you need to count "even numbers"
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6};
        // part 1
        int count=0;
        System.out.println("Part 1 : ");
        System.out.println("=====================");
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers : " + count);



    }
}
