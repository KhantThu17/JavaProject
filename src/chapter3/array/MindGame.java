package chapter3.array;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class MindGame {
    public static void main(String[] args) {
        Random Ran = new Random();
        int number = Ran.nextInt(99);number++;
        int count = 0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please Guess the number: ");
            int Int = scan.nextInt();
            count++;
            if (Int == number) {
                System.out.println(Int + " is True");
                break;
            } else if (Int != number && Int<=99) {
                System.out.println(Int + " is False");
                if (Int < number && Int>=1) {
                    System.out.println("You are guess number is small");
                } else if (Int > number && Int<=99) {
                    System.out.println("You are guess number is big");
                }
            } else{
                System.out.println("Please Enter 1 to 99");
            }

        }

        System.out.println(count + " times");
        if (count <= 4) {
            System.out.println("you are Genius");
        } else if (count <= 8) {
            System.out.println("You are Good");
        } else if (count <= 15) {
            System.out.println("You are Not Bad");
        } else {
            System.out.println("Please Delete The Game");
        }
    }
}
