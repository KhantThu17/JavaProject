package chapter3.array;

import java.util.Arrays;

public class ArrayLesson3 {
    public static void main(String[] args) {
       int numbers[][]=new int[4][];
        numbers[0]=new int[3];
        numbers[1]=new int[4];
        numbers[2]=new int[2];
        numbers[3]=new int[5];
        for (int[] number : numbers) {
            System.out.println(Arrays.toString(number));
        }
    }
}
