package own;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Ender Number :");
        int num1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please Ender Opt :");
        String opt = scan2.next();

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please Ender Number :");
        int num2 = scan1.nextInt();

        int result;

        if (opt.equals("+")) {
            result = num1 + num2;
            System.out.println("You are answer is =" + result);
        } else if (opt.equals("-")) {
            result = num1 - num2;
            System.out.println("You are answer is =" + result);
        } else if (opt.equals("*")) {
            result = num1 * num2;
            System.out.println("You are answer is +" + result);
        } else if (opt.equals("/")) {
            result = num1 / num2;
            System.out.println("You are answer is =" + result);
        } else if (opt.equals("%")) {
            result = num1 % num2;
            System.out.println("you are answer is =" + result);
        } else {
            System.out.println("This is no have");
        }

    }
}