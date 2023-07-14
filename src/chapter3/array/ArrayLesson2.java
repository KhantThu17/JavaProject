package chapter3.array;

import java.util.Arrays;

public class ArrayLesson2 {
    public static void main(String[] args) {
        int numbers[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {10, 9, 8},
        };
       System.out.println(numbers[0].length);
       System.out.println(numbers[0][1]);
       numbers[1][2] = 20;
        for (int[] number : numbers) {
            System.out.println();
            for (int i : number) {
                System.out.print(i + 10 + " ");
            }
            }
            for (int i = 1; i < numbers.length; i++) {
                System.out.println();
                System.out.print(Arrays.toString(numbers[i]));

            }
        }
    }


