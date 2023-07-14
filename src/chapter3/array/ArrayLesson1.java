package chapter3.array;

import java.util.Arrays;

public class ArrayLesson1 {
    public static void main(String[] args) {
        int a = 3;
        int numbers[] = {1, 2, 3, 4, 5, 10};
        String cars[] = new String[5];
        System.out.print(numbers[2]+" ");
        numbers[3] = 7;
        System.out.print(numbers[3]+" ");
        System.out.println(numbers.length);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");

        }
        for (int number : numbers) {
            System.out.print(number+"");

        }
        System.out.println(Arrays.toString(cars));
    }
}
